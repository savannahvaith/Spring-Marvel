package com.qa.marvel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Marks as table!
public class Marvel {
	
	// Attributes
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
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
	
	public Marvel() {
		// REQUIRED!
	}
	
	// Methods - GETTERS & SETTERS - REQUIRED!
	
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
