package com.qa.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Marvel> createCharacter(@RequestBody Marvel marvel) {
		this.marvelList.add(marvel);
		Marvel added = this.marvelList.get(this.marvelList.size()-1);
		return new ResponseEntity<Marvel>(added,HttpStatus.CREATED);
	}
	
	// READ
	@GetMapping("/getAll")
	public ResponseEntity<List<Marvel>> getMarvel(){
		return ResponseEntity.ok(this.marvelList);
	}
	
	
	// READ ONE
	@GetMapping("/getOne/{index}")
	public ResponseEntity<Marvel> getCharacterById(@PathVariable int index) {
		return ResponseEntity.ok(marvelList.get(index));
	}
	
	// DELETE
	@DeleteMapping("/remove/{index}")
	public Marvel removeCharacter(@PathVariable int index) {
		return this.marvelList.remove(index);
	}
	

}
