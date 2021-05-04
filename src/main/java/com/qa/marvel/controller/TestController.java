package com.qa.marvel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Allow external access to our app via HTTPRequests
public class TestController {
	
	@GetMapping("/test") // @TypeOfRequest("location")
	public String test() {
		return "Yay, it works";
	}

}
