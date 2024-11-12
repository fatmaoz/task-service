package com.oz.exception;

public class EmployeeCheckFailedException extends RuntimeException {
    
    public EmployeeCheckFailedException(String message) {
        super(message);
    }
    
}
