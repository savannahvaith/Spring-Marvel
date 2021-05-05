package com.qa.marvel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.marvel.domain.Marvel;
import com.qa.marvel.repo.MarvelRepo;


@Service
public class MarvelServiceDB implements MarvelService{
	
	private MarvelRepo repo; // <-- dependency
	
	public MarvelServiceDB(MarvelRepo repo) {
		this.repo = repo; 
	}
	
	@Override
	public Marvel create(Marvel m) {
		return this.repo.save(m);
	}

	@Override
	public List<Marvel> getAll() {
		return this.repo.findAll();
	}

	@Override
	public Marvel getById(Long id) {
		Optional<Marvel> optionalCharacter = this.repo.findById(id);
		return optionalCharacter.get(); 
		
//		Marvel character = this.repo.findById(id);
//		if(character != null) {
//			return character;
//		}else {
//			return null; 
//		}
		
	}

	@Override
	public boolean remove(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}

	@Override
	public Marvel update(Long id, Marvel newMarvel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marvel getCharacterByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
