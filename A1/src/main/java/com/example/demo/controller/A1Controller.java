package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api")
public class A1Controller {

	@Autowired
	private RestTemplate restTemplate;

	private static final String heyyaB = "heyya";

	@GetMapping("/hello")
	public String hello() {
		return "hello from service A";
	}

	@GetMapping("/heyya")
	@CircuitBreaker(name=heyyaB,fallbackMethod = "backup")
	public String heyya()
	{
		return restTemplate.getForObject("http://localhost:8088/api/heyya", String.class);
	}
	
	public String backup(Exception e) {
		
		return "hehe";
	}
}
