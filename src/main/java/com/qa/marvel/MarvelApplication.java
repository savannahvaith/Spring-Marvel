package com.qa.marvel;

import java.time.LocalTime;

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
		// Spring is creating the object for me here!
		// no need for TestController tc = new TestController();
		TestController tc = beanbag.getBean(TestController.class);
		System.out.println(tc.sayHello());
		
		// Access getCurrent() - by name
		System.out.println(beanbag.getBean("getCurrent"));
		
		// Access getCurrent() - by type
		System.out.println(beanbag.getBean(LocalTime.class));
		
		// Access getCurrent() - by name AND type
		System.out.println(beanbag.getBean("getCurrent",LocalTime.class));
		
		
		// Want to check if you have a bean in the beanbag
		System.out.println(beanbag.containsBean("getCurrent"));
		
		
		System.out.println(beanbag.getBean("getCurrent"));
	}
	
	
	// A bean is a managed object 
	// meaning the creating, maintenance and destruction of the object
	// is purely under the control of the Spring Framework!
	
	@Bean
	public String greeting() {
		return "Hello World!";
	}
	
	@Bean
	public LocalTime getCurrent() {
		return LocalTime.now(); 
	}

}
