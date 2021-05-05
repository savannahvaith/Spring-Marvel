package com.qa.marvel.service;

import java.util.List;

import com.qa.marvel.domain.Marvel;

public interface MarvelService {
	
	// template 
	// abstract methods - no method body!
	
	// CRUD OPERATIONS
	
	Marvel create(Marvel m); 
	List<Marvel> getAll();
	Marvel getById(Long id); 
	boolean remove(Long id); 
	Marvel update(Long id, Marvel newMarvel);
	Marvel getCharacterByName(String name); 

}
