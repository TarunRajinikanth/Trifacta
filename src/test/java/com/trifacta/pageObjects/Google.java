package com.trifacta.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trifacta.utilities.BaseClass;

public class Google extends BaseClass {
	
	

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//body/div[2]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
	WebElement SearchButton;
	
	public Google() {
		PageFactory.initElements(driver, this);
	}
	
	public void txtSearchBar(String text) {
		SearchBar.sendKeys(text);
	}
	
	public void hitSearch() {
		SearchButton.click();
	}
	
	public void hitEnter() {
		SearchBar.sendKeys(Keys.ENTER);
	}
}
