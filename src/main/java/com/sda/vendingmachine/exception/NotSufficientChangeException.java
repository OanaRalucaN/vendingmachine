package com.sda.vendingmachine.exception;

public class NotSufficientChangeException extends RuntimeException {

    public NotSufficientChangeException(String message) {
        super(message);
    }
}
