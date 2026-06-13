package com.ajay.security_employee_service.dto;

import com.ajay.security_employee_service.entity.Employee;

public class EmployeeResponse {
    private String message;
    private Employee emp;

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "message='" + message + '\'' +
                ", emp=" + emp +
                '}';
    }

    public EmployeeResponse() {
    }

    public EmployeeResponse(String message, Employee emp) {
        this.message = message;
        this.emp = emp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
}
