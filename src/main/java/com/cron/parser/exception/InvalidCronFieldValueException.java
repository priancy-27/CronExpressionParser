package com.cron.parser.exception;

public class InvalidCronFieldValueException extends RuntimeException {
    public InvalidCronFieldValueException() {
        super();
    }

    public InvalidCronFieldValueException(String message) {
        super(message);
    }
}
