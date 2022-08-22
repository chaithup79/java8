package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class A2Controller {

	@GetMapping("/heyya")
	public String heyya()
	{
		return "heyya from service 2";
	}
	
}
