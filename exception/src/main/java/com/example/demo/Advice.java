package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.NameException;

@RestControllerAdvice
public class Advice {
	
	
	@ExceptionHandler(NameException.class)
	public String getMessage(NameException ex)
	{
		return ex.getMessage();
	}

}
