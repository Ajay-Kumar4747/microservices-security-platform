package com.ajay.security_employee_service.utils;

import com.ajay.security_employee_service.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseUtils extends MongoRepository<Employee, Integer> {

}
