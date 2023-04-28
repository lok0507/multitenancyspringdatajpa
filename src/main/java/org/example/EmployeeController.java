package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee() {
//        Employee newEmployee = new Employee();
//        newEmployee.setName("Baeldung");
//        employeeRepository.save(newEmployee);
//        return ResponseEntity.ok(newEmployee);
        throw new EmployeeNotFoundException();
    }

    @PostMapping("/employees")
    public ResponseEntity<?> saveEmployee() {
        throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Database is not working");
    }
}
