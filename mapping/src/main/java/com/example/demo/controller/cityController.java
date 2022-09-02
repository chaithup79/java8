package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.city;
import com.example.demo.service.cityService;

@RestController
@RequestMapping("/api")
public class cityController {

	@Autowired
	private cityService cityservice;

	@GetMapping("/city/all")
	public List<city> getAllCities() {
		return cityservice.getAllCities();
	}

	@PostMapping("/city/save")
	public ResponseEntity<?> saveCity(@RequestBody city city) {
		cityservice.saveCity(city);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/city/{id}")
	public Optional<city> getCity(@PathVariable("id") int id)
	{
		return cityservice.getCity(id);
	}
	
//	public List<city> getCityOnCountry(@PathVariable("id") int id)
//	{
//		return cityservice.getCityOnCountry(id);
//	}
}
