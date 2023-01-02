package org.ostrade.cme;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SettlementDataService {

    private static final Logger log = LoggerFactory.getLogger(SettlementDataService.class);

    public enum Market {
        NYMEX
    }

    private final CsvMapper csvMapper;
    private final DateTimeFormatter SETTLEMENT_FILE_DTF = DateTimeFormatter.ofPattern("yyyyMMdd");

    public SettlementDataService() {
        this.csvMapper = new CsvMapper();
        csvMapper.registerModule(new JavaTimeModule());
    }

    public List<CMESettlementPrice> fetch(Market market, LocalDate localDate) throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(CMEConstants.FTP_URL, 21);
        int reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            throw new IOException("Exception in connecting to FTP Server");
        }
        ftpClient.login("anonymous", "anonymous");
        ftpClient.enterLocalPassiveMode();
        ftpClient.setAutodetectUTF8(true);
        String fileName = String.format("/settle/%s.settle.%s.s.csv", market.toString().toLowerCase(), localDate.format(SETTLEMENT_FILE_DTF));
        log.info("Fetching '{}'", fileName);
        try (InputStream fileInputStream = ftpClient.retrieveFileStream(fileName)) {
            List<CMESettlementPrice> settlementPrices = this.convert(fileInputStream);
            log.info("Fetched '{}' with {} records", fileName, settlementPrices.size());
            return settlementPrices;
        } catch (Exception e) {
            throw new FTPException(e.getMessage(), e);
        }
    }

    protected List<CMESettlementPrice> convert(InputStream inputStream) throws IOException {
        CsvSchema cmeSettlementPriceSchema = CsvSchema.emptySchema().withHeader();
        MappingIterator<CMESettlementPrice> mappingIterator = csvMapper.readerFor(CMESettlementPrice.class)
                .with(cmeSettlementPriceSchema)
                .readValues(inputStream);
        return mappingIterator.readAll();
    }

}
