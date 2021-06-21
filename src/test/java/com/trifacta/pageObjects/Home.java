package com.trifacta.pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trifacta.utilities.BaseClass;


public class Home extends BaseClass{
	Logger log = (Logger) LogManager.getLogger(Home.class.getName());
	@FindBy(xpath = "//div[contains(text(),'Welcome back,')]")
	WebElement HomePageConfirmation;
	
	@FindBy(xpath = "//div[@class='m-icon help tricon']")
	WebElement HelpButton;
	
	@FindBy(xpath = "//div[contains(text(),'About Trifacta Wrangler')]")
	WebElement AboutButton;
	
	@FindBy(xpath = "//div[@class='m-modal-body']//p[1]")
	WebElement ProductVersion;
	
	@FindBy(xpath = "//div[@class='m-modal-header']//a[@class='m-modal-close']")
	WebElement CloseAbout;
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Homepageconfirmation() throws IOException {
		boolean homepageIsDisplayed = false;
		if(HomePageConfirmation.isDisplayed() == true) {
			homepageIsDisplayed = true;
			
		}
		else if (HomePageConfirmation.isDisplayed() == false) {
			homepageIsDisplayed = false;
			
			captureScreen(driver, "Homepageconfirmation");
		}
		return homepageIsDisplayed;
	}
	
	public Logout homepage() throws InterruptedException {
		
		HelpButton.click();
		
		AboutButton.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(ProductVersion).build().perform();
		String Product = ProductVersion.getText();
		log.info("Product version captured is " +Product);
		Actions action2 = new Actions(driver);
		action2.moveToElement(CloseAbout).build().perform();
		CloseAbout.click();
		driver.switchTo().activeElement();
		return new Logout();
	}
}
