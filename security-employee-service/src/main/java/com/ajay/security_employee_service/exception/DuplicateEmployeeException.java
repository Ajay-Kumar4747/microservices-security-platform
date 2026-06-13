package com.ajay.security_employee_service.exception;

public class DuplicateEmployeeException extends RuntimeException {
    public DuplicateEmployeeException(String msg) {
        super(msg);
    }
}
