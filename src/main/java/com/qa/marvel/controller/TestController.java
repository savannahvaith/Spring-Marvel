package com.qa.marvel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Allow external access to our app via HTTPRequests
@RequestMapping("/api")
public class TestController {
	
	@GetMapping("/test") // @TypeOfRequest("location")
	public String test() {
		return "Yay, it works";
	}
	
	@GetMapping("/controller")
	public ResponseEntity<String> getController(){
		return new ResponseEntity<String>("Hey friends", HttpStatus.OK);
	}

}
