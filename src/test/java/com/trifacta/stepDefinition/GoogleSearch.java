package com.trifacta.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.trifacta.pageObjects.Google;
import com.trifacta.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GoogleSearch extends BaseClass {
	
	Google go;
	Logger log = (Logger) LogManager.getLogger(GoogleSearch.class.getName());

	@Given("^user launches google$")
	public void user_launches_google() {
		driver.get(URL);
	  log.info("Google is launched successfully");
	}

	@Then("^Enters \"([^\"]*)\" in search bar$")
	public void enters_in_search_bar(String value) {
	    go = new Google();
	    go.txtSearchBar(value);
	    log.info("Search value is provided");
	}

	@Then("^Clicks enter$")
	public void clicks_enter() throws InterruptedException {
	    go.hitEnter();
	    log.info("Search Results are obtained");
	    Thread.sleep(5000);
	}
	
}
