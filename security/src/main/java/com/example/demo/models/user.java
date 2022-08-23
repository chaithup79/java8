package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String password;
	private String roles;
	private boolean active;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public user(int id, String username, String password, String roles, boolean active) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + userName + ", password=" + password + ", roles=" + roles + ", active="
				+ active + "]";
	}

	public user() {

	}

}
