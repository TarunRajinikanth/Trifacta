package com.trifacta.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trifacta.utilities.BaseClass;


public class Logout extends BaseClass {

	@FindBy(className = "m-disk")
	WebElement ProfileButton;
	
	@FindBy(xpath = "//div[text()='Log out']")
	WebElement LogoutButton;
	
	@FindBy(xpath = "//body/div[@class='m-block-static-stack']/div[@class='external-page-main-view']/div[@class='m-block']/div[@class='sign-in-view m-block']/div[@class='m-layout']/div[1]/div[1]")
	WebElement LogoutConfirmation;
	
	public Logout() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean LogoutConfirmation() {
		return LogoutConfirmation.isDisplayed();
	}
	
	public void logout() {
		driver.getWindowHandle();
		ProfileButton.click();
		LogoutButton.click();
		
	}
}
