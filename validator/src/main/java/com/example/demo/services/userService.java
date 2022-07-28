package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.user;
import com.example.demo.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository repository;

	public user saveUser(user usr) {
		return repository.save(usr);
	}

	public user getUser(int id) {
		return repository.findById(id).get();
	}

	public List<user> getAllUsers() {
		return repository.findAll();
	}

}
