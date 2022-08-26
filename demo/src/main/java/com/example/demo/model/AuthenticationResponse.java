package com.example.demo.model;

public class AuthenticationResponse {

	private String Jwt;

	public AuthenticationResponse(String jwt) {
		super();
		Jwt = jwt;
	}

	public String getJwt() {
		return Jwt;
	}

	public void setJwt(String jwt) {
		Jwt = jwt;
	}
	
	
}
