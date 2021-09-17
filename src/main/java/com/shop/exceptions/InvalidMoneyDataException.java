package com.shop.exceptions;

public class InvalidMoneyDataException extends Exception {

    private String message;

    public InvalidMoneyDataException() {

    }

    public InvalidMoneyDataException(String message) {
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
