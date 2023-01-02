package org.ostrade.cme;

public class FTPException extends RuntimeException {

    public FTPException(String message) {
        super(message);
    }

    public FTPException(String message, Throwable cause) {
        super(message, cause);
    }

}
