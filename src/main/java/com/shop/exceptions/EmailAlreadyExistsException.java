package com.shop.exceptions;

public class EmailAlreadyExistsException extends Exception {


    private String message;


    public EmailAlreadyExistsException() {

    }

    public EmailAlreadyExistsException(String message) {
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
