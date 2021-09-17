package com.shop.exceptions;

public class EmptyBasketException extends Exception {

    private String message;

    public EmptyBasketException() {

    }

    public EmptyBasketException(String message) {
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
