package org.ostrade.cmeftp.settlement;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.ostrade.cmeftp.CMEExchange;
import org.ostrade.cmeftp.CMEFTPClient;
import org.ostrade.cmeftp.CMEFTPException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CMESettlementDataService {

    private static final Logger log = LoggerFactory.getLogger(CMESettlementDataService.class);

    private final CMEFTPClient cmeFtpClient;
    private final CsvMapper csvMapper;
    private final DateTimeFormatter SETTLEMENT_FILE_DTF = DateTimeFormatter.ofPattern("yyyyMMdd");

    public CMESettlementDataService() {
        this.cmeFtpClient = new CMEFTPClient();
        this.csvMapper = new CsvMapper();
        csvMapper.registerModule(new JavaTimeModule());
    }

    public List<CMESettlementPrice> fetch(CMEExchange CMEExchange, LocalDate localDate) {
        String fileName = String.format("/settle/%s.settle.%s.s.csv", CMEExchange.toString().toLowerCase(), localDate.format(SETTLEMENT_FILE_DTF));
        log.info("Fetching '{}'", fileName);
        cmeFtpClient.connect();
        try (InputStream fileInputStream = cmeFtpClient.retrieveFileStream(fileName)) {
            List<CMESettlementPrice> settlementPrices = this.convert(fileInputStream);
            log.info("Fetched '{}' with {} records", fileName, settlementPrices.size());
            return settlementPrices;
        } catch (Exception e) {
            throw new CMEFTPException(e.getMessage(), e);
        } finally {
            cmeFtpClient.disconnect();
        }
    }

    protected List<CMESettlementPrice> convert(InputStream inputStream) {
        CsvSchema cmeSettlementPriceSchema = CsvSchema.emptySchema().withHeader();
        try {
            MappingIterator<CMESettlementPrice> mappingIterator = csvMapper.readerFor(CMESettlementPrice.class)
                    .with(cmeSettlementPriceSchema)
                    .readValues(inputStream);
            return mappingIterator.readAll();
        } catch (IOException e) {
            throw new CMEFTPException(e);
        }
    }

}
