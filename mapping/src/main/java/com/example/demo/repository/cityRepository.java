package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.city;

@Repository
public interface cityRepository extends JpaRepository<city, Integer> {

//	
//	List<city> findByCountryId(int id);
}
