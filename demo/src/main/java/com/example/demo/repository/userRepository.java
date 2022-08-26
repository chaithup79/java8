package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.user;

@Repository
public interface userRepository extends JpaRepository<user, Integer>{

	
	Optional<user> findByUsername(String username);
}
