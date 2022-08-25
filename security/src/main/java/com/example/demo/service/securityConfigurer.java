package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class securityConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	private myUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}

//	@Bean
//	public UserDetailsService configAuthentication()
//	{
//	
//		return new UserDetailsService(userDetailsService);
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/api/helloUser").hasAnyRole("USER","ADMIN").antMatchers("/api/helloAdmin")
				.hasRole("ADMIN").antMatchers("/api/user").permitAll().and().formLogin();
	}
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/api/helloUser").hasAnyRole("USER", "ADMIN")
//				.antMatchers("/api/helloAdmin").hasRole("ADMIN").antMatchers("/api/user").permitAll().and().formLogin();
//		return http.build();
//	}

//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}

}
