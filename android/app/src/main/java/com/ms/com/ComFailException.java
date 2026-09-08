package com.ms.com;

public class ComFailException extends RuntimeException {
    public ComFailException() {
    }

    public ComFailException(String message) {
        super(message);
    }
}
