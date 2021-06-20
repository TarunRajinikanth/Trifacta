package com.trifacta.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
		
	@Given("^users launches the webapplication$")
	public void users_launches_the_webapplication() throws IOException {
		  LoginPage = new Login();
		  
		  if (LoginPage.LoginPageLogo()==true) {
			  logg.info("Login page is loaded successfully");
			  Assert.assertTrue(true);	
		  }
		  else {
			  logg.info("Login page failed to load");
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
		   Assert.assertTrue(HomePage.Homepageconfirmation());
	}

	
	@Then("^logout from the website$")
	public void logout_from_the_website() throws InterruptedException {
	   LogoutPage = HomePage.homepage();
	   LogoutPage.logout();
	   if(LogoutPage.LogoutConfirmation()==true) {
		   logg.info("User logged out successfull");
		   Assert.assertTrue(true);
	   }
	   else if (LogoutPage.LogoutConfirmation()==false) {
		   logg.info("User Logout failed");
		   Assert.assertTrue(false);
	  
	}

}
	
	
}
