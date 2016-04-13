package com.example.jv_jo.educationpratice.exceptions;

/**
 * Created by jv_jo on 05/04/2016.
 */
public class AuthenticatedException extends Exception {
    public AuthenticatedException() {
        super();
    }

    public AuthenticatedException(String detailMessage) {
        super(detailMessage);
    }

    public AuthenticatedException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public AuthenticatedException(Throwable throwable) {
        super(throwable);
    }
}
