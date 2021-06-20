package com.trifacta.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.trifacta.utilities.BaseClass;



public class Login extends BaseClass{
	
	@FindBy(xpath = "//div[@class='m-layout']//div[1]//div[1]//input[1]")
	WebElement username;
	
	@FindBy(xpath = "//div[@class='m-block']//div[2]//div[1]//input[1]")
	WebElement password;
	
	@FindBy(className = "m-button-primary")
	WebElement LoginButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement LoginLogo;
	

	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean LoginPageLogo() throws IOException {
		
		Boolean isDisplayed = false;
		if(LoginLogo.isDisplayed()==true) {
			logg.info("Expected Logo is displayed");
			isDisplayed = true;
		}
		else if (LoginLogo.isDisplayed()==false) {
			logg.info("Failed to display the logo");
			captureScreen(driver, "LoginPageLogo");
			isDisplayed = false;
		}
		
		return isDisplayed;
		
	}
	
	
	
	public Home login(String uname, String pword) {
		
		username.sendKeys(uname);
		logg.info("Username is entered");
		password.sendKeys(pword);
		logg.info("password is entered");
		LoginButton.click();
		logg.info("Login button is clicked");
		return new Home();
	}
	
	
	
}
