package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.country;
import com.example.demo.service.countryService;

@RestController
@RequestMapping("/api")
public class countryController {

	@Autowired
	private countryService countryservice;

	@GetMapping("/country/all")
	public List<country> getAllCountries() {
		return countryservice.getAllCountries();
	}

	@PostMapping("/country/save")
	public country saveCountry(@RequestBody country country) {
		return countryservice.saveCountry(country);
	}
	
	@GetMapping("/country/{id}")
	public Optional<country> getCountry(@PathVariable("id") int id)
	{
		return countryservice.getCountry(id);
	}
}
