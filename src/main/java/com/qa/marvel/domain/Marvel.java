package com.qa.marvel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity // Marks as table!
public class Marvel {
	
	// Attributes
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
	private Long id;
	
	@NotNull(message = "Name may not be null")
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
	
	// Constructor with ID
	public Marvel(Long id, @NotNull(message = "Name may not be null") String name, String species, boolean dead,
			boolean superSoldier) {
		super();
		this.id = id;
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

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (dead ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		result = prime * result + (superSoldier ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marvel other = (Marvel) obj;
		if (dead != other.dead)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (superSoldier != other.superSoldier)
			return false;
		return true;
	} 
	
	
	

}
