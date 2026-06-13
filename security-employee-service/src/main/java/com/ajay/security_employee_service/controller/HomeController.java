package com.ajay.security_employee_service.controller;

import com.ajay.security_employee_service.dto.AllEmployeesResponse;
import com.ajay.security_employee_service.dto.EmployeeResponse;
import com.ajay.security_employee_service.entity.Employee;
import com.ajay.security_employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class HomeController {

    private final EmployeeService service;
    @Autowired
    public HomeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/findAll")
    public ResponseEntity<AllEmployeesResponse> findAll() {
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<EmployeeResponse> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findById(id),HttpStatus.OK);

    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeResponse> save(@RequestBody Employee emp) {

       return new ResponseEntity<>(service.save(emp), HttpStatus.CREATED);
    }
}
