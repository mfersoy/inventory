package com.inventory.example.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){

        super(message);

    }
}
