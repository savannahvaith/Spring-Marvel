package com.qa.marvel.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.marvel.domain.Marvel;
import com.qa.marvel.service.MarvelService;

@RestController
public class MarvelController {
	
	private MarvelService service; 
	
	public MarvelController(MarvelService service) {
		this.service = service; 
	}
		
	
	// CREATE
	@PostMapping("/create")
	public ResponseEntity<Marvel> createCharacter(@RequestBody Marvel marvel) {
		return new ResponseEntity<Marvel>(this.service.create(marvel),HttpStatus.CREATED);
	}
	
	// READ
	@GetMapping("/getAll")
	public ResponseEntity<List<Marvel>> getMarvel(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	
	// READ ONE
	@GetMapping("/getOne/{index}")
	public ResponseEntity<Marvel> getCharacterById(@PathVariable Long index) {
		return ResponseEntity.ok(this.service.getById(index));
	}
	
	// DELETE
	@DeleteMapping("/remove/{index}")
	public Marvel removeCharacter(@PathVariable Long index) {
		this.service.remove(index);
		return this.service.getById(index);
	}
	
	@GetMapping("/findByName")
	public Marvel findByName(@PathParam("name") String name) {
		for(Marvel m : this.service.getAll()) {
			System.out.println(m.getName());
		}
		System.out.println(name);
		return null; 
	}
	

}
