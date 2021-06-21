package com.trifacta.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.trifacta.pageObjects.Home;
import com.trifacta.pageObjects.Login;
import com.trifacta.pageObjects.Logout;
import com.trifacta.utilities.BaseClass;
import com.trifacta.utilities.XLUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseClass{
	
	Login LoginPage;
	Home HomePage;
	Logout LogoutPage;
	Logger log = (Logger) LogManager.getLogger(LoginStep.class.getName());	
	@Given("^users launches the webapplication$")
	public void users_launches_the_webapplication() throws IOException {
		driver.get(URL2);
		  LoginPage = new Login();
		  log.info("Login page is launched");
		  if (LoginPage.LoginPageLogo()==true) {
			  log.info("Login Page is loaded as expected.");
			  Assert.assertTrue(true);	
		  }
		  else {
			  log.error("Failed to load login page");
			  Assert.assertTrue(false);	 
		  }
	}

	@When("^user enters valid credentials \"([^\"]*)\" and (\\d+) lands on homepage check for the product version$")
	public void user_enters_valid_credentials_and_rownum_lands_on_homepage_check_for_the_product_version(String sheetname, int rownum) throws InvalidFormatException, IOException  {
		XLUtil xl = new XLUtil();
		   List<Map<String,String>> userData = xl.getData(System.getProperty("user.dir")+"/src/test/java/com/trifacta/testData/LoginData.xlsx", sheetname);
		   String username = userData.get(rownum).get("Username");
		   String password = userData.get(rownum).get("Password");
		   HomePage = LoginPage.login(username, password);
		   log.info("Username and password are entred successfully and Login is inprogress...");
		   Assert.assertTrue(HomePage.Homepageconfirmation());
		   log.info("Login is successful, Home page is loaded");
	}

	
	@Then("^logout from the website as well$")
	public void logout_from_the_website() throws InterruptedException {
	   LogoutPage = HomePage.homepage();
	   log.info("Product version is captured successfully");
	   LogoutPage.logout();
	   if(LogoutPage.LogoutConfirmation()==true) {
		   log.info("Logged out from the account");
		   Assert.assertTrue(true);
	   }
	   else if (LogoutPage.LogoutConfirmation()==false) {
		   log.info("Logout failed");
		   Assert.assertTrue(false);
	  
	}

}
	
	
}
