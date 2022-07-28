package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.services.userService;

@RestController
@RequestMapping("/api")
public class userController {

	@Autowired
	private userService service;

	@GetMapping("user/{id}")
	public user getUser(@PathVariable("id") int id) {
		return service.getUser(id);
	}

	@GetMapping("/user/all")
	public List<user> getAllUsers() {
		return service.getAllUsers();
	}

	@PostMapping("/user/save")
	public user saveUser(@Valid @RequestBody user usr) {
		return service.saveUser(usr);
	}
}
