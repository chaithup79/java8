package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AuthenticationResponse;
import com.example.demo.service.myUserDetails;
import com.example.demo.service.myUserDetailsService;
import com.example.demo.utility.JwtUtility;

@RestController
@RequestMapping("/api")
public class helloController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private myUserDetailsService userDetailsService;
	
	
	@Autowired
	private JwtUtility jwtUtility;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> createToken(@RequestBody AuthenticationRequest request) {
		try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		}
		catch(Exception e)
		{
			throw new UsernameNotFoundException("invalid credentials");
		}
		UserDetails userDetails=userDetailsService.loadUserByUsername(request.getUsername());
		String Jwt=jwtUtility.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(Jwt));
		
	}
}
