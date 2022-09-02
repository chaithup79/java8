package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.country;

@Repository
public interface countryRepository extends JpaRepository<country, Integer> {

}
