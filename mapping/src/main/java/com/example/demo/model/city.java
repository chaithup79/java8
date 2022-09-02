package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class city {

	@Id
	@GeneratedValue
	private int id;
	private String cityname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

//	public country getCountry() {
//		return country;
//	}
//
//	public void setCountry(country country) {
//		this.country = country;
//	}
//
//	public city(int id, String cityname, country country) {
//		super();
//		this.id = id;
//		this.cityname = cityname;
//		this.country = country;
//	}
	
	

	public city() {

	}

public city(int id, String cityname) {
	super();
	this.id = id;
	this.cityname = cityname;
}

}
