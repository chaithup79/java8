package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.country;
import com.example.demo.repository.countryRepository;

@Service
public class countryService {

	@Autowired
	private countryRepository countryrepository;
	
	
	public List<country> getAllCountries()
	{
		return countryrepository.findAll();
	}
	
	public country saveCountry(country country)
	{
		return countryrepository.save(country);
	}
	
	public Optional<country> getCountry(int id)
	{
		return countryrepository.findById(id);
	}
}
