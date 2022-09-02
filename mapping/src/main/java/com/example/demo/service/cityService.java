package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.city;
import com.example.demo.repository.cityRepository;

@Service
public class cityService {

	@Autowired
	private cityRepository cityrepository;
	
	
	public List<city> getAllCities()
	{
		return cityrepository.findAll();
	}
	
	public city saveCity(city city)
	{
		return cityrepository.save(city);
	}
	
	public Optional<city> getCity(int id)
	{
		return cityrepository.findById(id);
	}
	
//	public List<city> getCityOnCountry(int id)
//	{
//		return cityrepository.findByCountryId(id);
//	}
}
