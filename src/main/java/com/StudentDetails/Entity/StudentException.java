package com.StudentDetails.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class StudentException {
	@ExceptionHandler(StudentAgeException.class)
	public ResponseEntity<Object> agenotHere(){
		return new ResponseEntity<>("restricted by age",HttpStatus.NOT_FOUND);
		
	}

}
