package com.qa.marvel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.marvel.domain.Marvel;

@Service
public class MarvelServiceList implements MarvelService{
	
	private List<Marvel> marvelList; // <-- dependency
	
	public MarvelServiceList(List<Marvel> marvelList) {
		this.marvelList = marvelList; 
	}

	@Override
	public Marvel create(Marvel m) {
		this.marvelList.add(m);
		Marvel added = this.marvelList.get(this.marvelList.size() - 1);
		return added;
	}

	@Override
	public List<Marvel> getAll() {
		return this.marvelList;
	}

	@Override
	public Marvel getById(int id) {
		return this.marvelList.get(id);
	}

	@Override
	public boolean remove(int id) {
		this.marvelList.remove(id);
		return true;
	}

	@Override
	public Marvel update(int id, Marvel newMarvel) {
		return null;
	}

	@Override
	public Marvel getCharacterByName(String name) {
		return null;
	}

}
