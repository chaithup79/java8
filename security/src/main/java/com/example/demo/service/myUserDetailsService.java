package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.user;
import com.example.demo.repository.userRepository;

@Service
public class myUserDetailsService implements UserDetailsService {

	@Autowired
	private userRepository repository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<user> user = repository.findByUserName(userName);
		user.orElseThrow(() -> new UsernameNotFoundException("this user doesn't exist"));
		return user.map(myUserDetails::new).get();
	}

}
