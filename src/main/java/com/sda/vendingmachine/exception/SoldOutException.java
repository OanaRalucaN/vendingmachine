package com.sda.vendingmachine.exception;

public class SoldOutException extends RuntimeException {
    public SoldOutException(String message) {
        super(message);
    }
}
