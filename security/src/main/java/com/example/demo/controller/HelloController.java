package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.repository.userRepository;

@RestController
@RequestMapping("/api")
public class HelloController {

	@Autowired
	private userRepository repository;

	@GetMapping("/helloUser")
	public String heyya() {
		return "hello";
	}

	@GetMapping("/helloAdmin")
	public String heyyaAdmin() {
		return "hello admin";
	}

	@PostMapping("/user")
	public user saveUser(@RequestBody user user) {
	     return	repository.save(user);
		
	}

}
