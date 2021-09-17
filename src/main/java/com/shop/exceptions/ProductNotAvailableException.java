package com.shop.exceptions;

public class ProductNotAvailableException extends Exception {

    private String message;

    public ProductNotAvailableException() {

    }

    public ProductNotAvailableException(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
