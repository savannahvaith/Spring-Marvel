package com.qa.marvel.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="enter")
	private WebElement enterLink;

	public WebElement getEnterLink() {
		return enterLink;
	} 

}
