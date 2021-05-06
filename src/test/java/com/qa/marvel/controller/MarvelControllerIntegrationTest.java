package com.qa.marvel.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.marvel.domain.Marvel;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // load the context
@AutoConfigureMockMvc
public class MarvelControllerIntegrationTest {
	
	@Autowired
	private MockMvc mockMVC; 
	
	@Autowired
	private ObjectMapper mapper; 
//	{
//		"name" : "Thor",
//		"species":"Asguardian",
//		"dead":false,
//		"superSolider":true
//	}
	
	
	
	@Test
	void testCreate() throws Exception {
		
		// Create a character
//		Marvel thor = new Marvel("Thor", "Asguardian", false, true);
//		
//		// Convert it to a JSON String
//		String thorAsJSON = this.mapper.writeValueAsString(thor);
//		
//		// Build our mock REQUEST
//		RequestBuilder mockRequest = 
//				post("/create")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(thorAsJSON);
//		
//		// Create our "saved" character
//		Marvel savedThor = new Marvel(1L, "Thor", "Asguardian", false, true);
//		
//		// Convert "saved" character to json
//		String savedThorAsJSON = this.mapper.writeValueAsString(savedThor);
//		
//		// Check status is 201 - CREATED
//		ResultMatcher matchStatus = status().isCreated();
//		
//		// Check that the response body is the correct character
//		ResultMatcher matchBody = content().json(savedThorAsJSON);
//		
//		this.mockMVC.perform(mockRequest).andExpect(matchStatus).andExpect(matchBody);
		
		
		// for demo puposes:
		
		this.mockMVC.perform(
				post("/create")
					.contentType(MediaType.APPLICATION_JSON)
					.content(this.mapper.writeValueAsString(new Marvel("Thor","Asguardian",false,true))))
				.andExpect(status().isCreated())
				.andExpect(content().json(this.mapper.writeValueAsString(new Marvel(1L,"Thor","Asguardian",false,true))));
	}

}
