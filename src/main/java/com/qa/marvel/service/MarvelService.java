package com.qa.marvel.service;

import java.util.List;

import com.qa.marvel.domain.Marvel;

public interface MarvelService {
	
	// template 
	// abstract methods - no method body!
	
	// CRUD OPERATIONS
	
	Marvel create(Marvel m); 
	List<Marvel> getAll();
	Marvel getById(int id); 
	boolean remove(int id); 
	Marvel update(int id, Marvel newMarvel);
	Marvel getCharacterByName(String name); 

}
