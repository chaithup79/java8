package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

@Entity
public class user {

	@Id
	private int id;

	@Length(max = 10, min = 2)
	private String userName;

	@Email
	private String email;

	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public user(int id, @Length(max = 10, min = 2) String userName, @Email String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public user() {

	}

	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}

}
