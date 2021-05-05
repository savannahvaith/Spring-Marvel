package com.qa.marvel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.marvel.domain.Marvel;
import com.qa.marvel.repo.MarvelRepo;

@Service
public class MarvelService{
	
	private MarvelRepo repo;
	
	public MarvelService(MarvelRepo repo) {
		this.repo = repo; 
	}
	
	public Marvel create(Marvel m) {
		return this.repo.save(m);
	}

	public List<Marvel> getAll() {
		return this.repo.findAll();
	}

	public Marvel getById(Long id) {
		Optional<Marvel> optionalCharacter = this.repo.findById(id);
		return optionalCharacter.get(); 
	}

	public boolean remove(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	public Marvel update(Long id, Marvel newMarvel) {
		return null;
	}

	public Marvel getCharacterByName(String name) {
		return null;
	}

}
