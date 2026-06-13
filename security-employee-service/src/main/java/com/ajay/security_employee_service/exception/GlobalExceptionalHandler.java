package com.ajay.security_employee_service.exception;


import com.ajay.security_employee_service.dto.EmployeeResponse;
import com.ajay.security_employee_service.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {

    @ExceptionHandler(DuplicateEmployeeException.class)
    public ResponseEntity<EmployeeResponse> duplicateEmployeeException(DuplicateEmployeeException ex) {
        EmployeeResponse emp = new EmployeeResponse();
        emp.setMessage(ex.getMessage());
        emp.setEmp(new Employee());
        return new ResponseEntity<>(emp, HttpStatus.CONFLICT);
    }
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<EmployeeResponse> employeeNotFoundException(EmployeeNotFoundException ex) {
        EmployeeResponse emp = new EmployeeResponse();
        emp.setMessage(ex.getMessage());
        emp.setEmp(new Employee());
        return new ResponseEntity<>(emp, HttpStatus.NOT_FOUND);
    }

}
