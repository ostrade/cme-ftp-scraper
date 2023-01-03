package org.ostrade.cmeftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;

public class CMEFTPClient {

    private static final String CME_FTP_HOSTNAME = "ftp.cmegroup.com";
    private static final String CME_FTP_USERNAME = "anonymous";
    private static final String CME_FTP_PASSWORD = "anonymous";

    private final FTPClient ftpClient;

    public CMEFTPClient() {
        ftpClient = new FTPClient();
    }

    public void connect() {
        try {
            ftpClient.connect(CME_FTP_HOSTNAME);
            int reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                throw new CMEFTPException("Exception in connecting to FTP Server");
            }
            ftpClient.login(CME_FTP_USERNAME, CME_FTP_PASSWORD);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setAutodetectUTF8(true);
        } catch (IOException e) {
            throw new CMEFTPException(e);
        }
    }

    public InputStream retrieveFileStream(String remote) {
        try {
            return this.ftpClient.retrieveFileStream(remote);
        } catch (IOException e) {
            throw new CMEFTPException(e);
        }
    }

    public void disconnect() {
        try {
            this.ftpClient.disconnect();
        } catch (IOException e) {
            throw new CMEFTPException(e);
        }
    }

}
