package com.qa.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.marvel.domain.Marvel;

@RestController
public class MarvelController {
	
	private List<Marvel> marvelList = new ArrayList<>(); 
	
	// CRUD 
	
	// CREATE
	@PostMapping("/create")
	public void createCharacter(@RequestBody Marvel marvel) {
		this.marvelList.add(marvel);
	}
	
	// READ
	@GetMapping("/getAll")
	public List<Marvel> getMarvel(){
		return this.marvelList;
	}
	
	
	// READ ONE
	@GetMapping("/getOne/{index}")
	public Marvel getCharacterById(@PathVariable int index) {
		return this.marvelList.get(index);
	}
	
	// DELETE
	@DeleteMapping("/remove/{index}")
	public Marvel removeCharacter(@PathVariable int index) {
		return this.marvelList.remove(index);
	}
	

}
