package com.qa.marvel.config;

import org.springframework.context.annotation.Bean;
import java.time.LocalTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	// By default Beans have a SINGLETON instance = only one instance that is continuously changed
	@Bean
	public LocalTime getCurrent() {
		return LocalTime.now();
	}
	
	// @Scope("prototype") = create multiple instances of the object in the beanbag 
	@Bean
	@Scope("prototype")
    public String farewell() {
        return "Goodbye";
    }
}
