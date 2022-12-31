package org.ostrade.cme;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SettlementDataService {

    public enum Market {
        NYMEX
    }

    public List<CMESettlementPrice> fetchLatest(Market market) throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(CMEConstants.FTP_URL);
        int reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            throw new IOException("Exception in connecting to FTP Server");
        }
        InputStream inputStream = null;
        return this.convert(inputStream);
    }

    protected List<CMESettlementPrice> convert(InputStream inputStream) throws IOException {
        CsvSchema cmeSettlementPriceSchema = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        MappingIterator<CMESettlementPrice> mappingIterator = csvMapper.readerFor(CMESettlementPrice.class)
                .with(cmeSettlementPriceSchema)
                .readValues(inputStream);
        return mappingIterator.readAll();
    }

}
