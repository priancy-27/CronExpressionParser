package com.cron.parser.exception;

public class InvalidCronExpressionException extends RuntimeException {
    public InvalidCronExpressionException() {
        super();
    }

    public InvalidCronExpressionException(String message) {
        super(message);
    }
}
