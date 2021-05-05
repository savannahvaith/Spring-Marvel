package com.qa.marvel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.marvel.domain.Marvel;

@Repository
public interface MarvelRepo extends JpaRepository<Marvel, Long>{
	
}
