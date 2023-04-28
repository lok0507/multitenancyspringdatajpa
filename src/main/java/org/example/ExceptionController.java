package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<Object> exception(EmployeeNotFoundException exception) {
        return new ResponseEntity<>("Some thing went wrong", HttpStatus.UNAUTHORIZED);
    }
}
