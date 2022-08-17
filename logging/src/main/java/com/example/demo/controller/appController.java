package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class appController {

	private static final Logger logger=LoggerFactory.getLogger(appController.class);
	@GetMapping("/hello")
	public String hello() {
		
		
		logger.info("hello api is called");
		return "heyya";
	}
	
	@GetMapping("/hello/{name}")
	public String helloName(@PathVariable("name") String name) throws NameException
	{
		if(name.startsWith("a") || name.startsWith("e") || name.startsWith("i") || name.startsWith("o") || name.startsWith("u"))
		{
			logger.error("name cannot be start with vowel");
			throw new NameException("name cannot be start with vowel");
			
		}
		else
		{
			return name;
		}
	}
}
