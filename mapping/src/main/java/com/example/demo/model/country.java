package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class country {

	@Id
	@GeneratedValue
	private int id;
	private String countryname;
	private String countrycode;

	@OneToMany(targetEntity = city.class, cascade = CascadeType.ALL)
	@JoinColumn(name="fk", referencedColumnName = "id")
	private List<city> city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<city> getCity() {
		return city;
	}

	public void setCities(List<city> city) {
		this.city = city;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public country(int id, String countryname, String countrycode) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.countrycode = countrycode;
	}

	
	public void setCity(List<city> city) {
		this.city = city;
	}

	public country(int id, String countryname, String countrycode, List<com.example.demo.model.city> city) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.countrycode = countrycode;
		this.city = city;
	}

	public country() {

	}

}
