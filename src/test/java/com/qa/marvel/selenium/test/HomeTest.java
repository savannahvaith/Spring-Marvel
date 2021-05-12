package com.qa.marvel.selenium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomeTest {
	
	@LocalServerPort
	int randomPort; 
	
	private static final String URL = "http://localhost:";
	
	private WebDriver driver; 
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true); // we won't have the window popping up 
		driver = new ChromeDriver(option);
		driver.manage().window().setSize(new Dimension(1990, 789));
	}
	
	@Test
	public void checkURL() {
		driver.get(URL+randomPort+"/");
		assertEquals(URL+randomPort+"/",driver.getCurrentUrl());
	}
	
	

}
