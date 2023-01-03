package org.ostrade.cmeftp;

public class CMEFTPException extends RuntimeException {

    public CMEFTPException(String message) {
        super(message);
    }

    public CMEFTPException(Throwable cause) {
        super(cause);
    }

    public CMEFTPException(String message, Throwable cause) {
        super(message, cause);
    }

}
