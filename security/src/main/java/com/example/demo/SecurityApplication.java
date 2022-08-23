package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.repository.userRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = userRepository.class)
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

//	@PostConstruct
//	public void init()
//	{
//		
//	}
	
}
