package com.qa.marvel.domain;

public class Marvel {
	
	// Attributes
	private Long id;
	private String name;
	private String species; 
	private boolean dead;
	private boolean superSoldier;
	
	// Constructor
	public Marvel(String name, String species, boolean dead, boolean superSoldier) {
		super();
		this.name = name;
		this.species = species;
		this.dead = dead;
		this.superSoldier = superSoldier;
	}
	
	
	// Methods - GETTERS & SETTERS
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public boolean isSuperSoldier() {
		return superSoldier;
	}
	public void setSuperSoldier(boolean superSoldier) {
		this.superSoldier = superSoldier;
	} 
	
	
	

}
