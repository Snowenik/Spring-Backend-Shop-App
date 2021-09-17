package com.shop.exceptions;

public class NotEnoughMoneyException extends Exception {


    private String message;

    public NotEnoughMoneyException() {

    }

    public NotEnoughMoneyException(String message) {
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
