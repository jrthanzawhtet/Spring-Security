package com.jdc.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
	
	@Bean
	SecurityFilterChain homeFilter(HttpSecurity http) throws Exception {
		http.securityMatcher("/")
		     .authorizeHttpRequests(request -> {
			     request.anyRequest().permitAll();
		     });
		return http.build();
		
	}
	
	@Bean
	SecurityFilterChain resourceFilter(HttpSecurity http) throws Exception {
		http.securityMatcher("/resources")
		     .authorizeHttpRequests(request -> {
			     request.anyRequest().permitAll();
		     });
		return http.build();
		
	}
	
	@Bean
	SecurityFilterChain httpFilter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(request -> {
			     request.anyRequest().permitAll();
		     });
		return http.build();
		
	}
}
