package com.shop.exceptions;

public class ProductDoesntExistsException extends Exception {


    private String message;


    public ProductDoesntExistsException() {

    }

    public ProductDoesntExistsException(String message) {
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
