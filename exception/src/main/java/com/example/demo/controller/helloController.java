package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.NameException;

@RestController
@RequestMapping("/api")
public class helloController {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name ) throws NameException
	{
		
		
		if(name.contains("a"))
		{
			throw new NameException("name starts with a");
		}
		return "heyya" + name;
	}
	
}
