package com.qa.marvel.config;

import org.springframework.context.annotation.Bean;
import java.time.LocalTime;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public LocalTime getCurrent() {
		return LocalTime.now();
	}

}
