package com.example.foodApplication.exception;

public class UnauthorisedAccessException extends RuntimeException{
    public UnauthorisedAccessException(String message) {
        super(message);
    }
}
