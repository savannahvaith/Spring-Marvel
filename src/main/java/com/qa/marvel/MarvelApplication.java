package com.qa.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.qa.marvel.controller.TestController;

@SpringBootApplication
public class MarvelApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(MarvelApplication.class, args);
		
		System.out.println(beanbag.getBean("greeting"));
		TestController tc = beanbag.getBean(TestController.class);
		System.out.println(tc);
		
	}
	
	
	// A bean is a managed object 
	// meaning the creating, maintenance and destruction of the object
	// is purely under the control of the Spring Framework!
	
	@Bean
	public String greeting() {
		return "Hello World!";
	}

}
