package com.ajay.security_employee_service.dto;

import com.ajay.security_employee_service.entity.Employee;

import java.util.List;

public class AllEmployeesResponse {
    private String message;
    private List<Employee> emps;

    @Override
    public String toString() {
        return "AllEmployeesResponse{" +
                "message='" + message + '\'' +
                ", emps=" + emps +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public AllEmployeesResponse() {
    }

    public AllEmployeesResponse(String message, List<Employee> emps) {
        this.message = message;
        this.emps = emps;
    }
}
