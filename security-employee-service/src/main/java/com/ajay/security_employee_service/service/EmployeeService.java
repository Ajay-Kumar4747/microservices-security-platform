package com.ajay.security_employee_service.service;

import com.ajay.security_employee_service.dto.AllEmployeesResponse;
import com.ajay.security_employee_service.dto.EmployeeResponse;
import com.ajay.security_employee_service.entity.Employee;
import com.ajay.security_employee_service.exception.DuplicateEmployeeException;
import com.ajay.security_employee_service.exception.EmployeeNotFoundException;
import com.ajay.security_employee_service.utils.DatabaseUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final DatabaseUtils util;

    public EmployeeService(DatabaseUtils util) {
        this.util = util;
    }

    public EmployeeResponse save(Employee emp) {
        if(util.existsById(emp.getId())) {
            throw new DuplicateEmployeeException("Employee with id : " + emp.getId() + " already exists");
        }
        Employee e = util.save(emp);
        return new EmployeeResponse("success",e);
    }

    public AllEmployeesResponse findAll() {
        List<Employee> emps = util.findAll();
        return new AllEmployeesResponse("success",emps);

    }

    public EmployeeResponse findById(int id) {

        Employee emp = util.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee with id : " + id + " not found "));
        return new EmployeeResponse("success",emp);
    }
}
