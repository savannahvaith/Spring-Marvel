package com.qa.marvel.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.marvel.domain.Marvel;
import com.qa.marvel.repo.MarvelRepo;

@SpringBootTest
public class MarvelServiceUnitTest {
	
	@Autowired
	private MarvelService service; 
	
	@MockBean
	private MarvelRepo repo; 
	
	@Test
	void testCreate() {
		// GIVEN 
		
		Marvel thor = new Marvel("Thor", "Asguardian", false,true);
		Marvel savedThor = new Marvel(1L,"Thor", "Asguardian", false,true);
		
		// WHEN 
		Mockito.when(this.repo.save(thor)).thenReturn(savedThor);
		
		// THEN
		assertThat(this.service.create(thor)).isEqualTo(savedThor);
		
		Mockito.verify(this.repo, Mockito.times(1)).save(thor);
	}
	
}
