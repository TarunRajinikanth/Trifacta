package com.trifacta.runner;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.trifacta.utilities.ReadConfig;
import com.trifacta.utilities.WaitUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/trifacta/features",
		glue= {"com.trifacta.stepDefinition"},
		dryRun = false,
		tags = {"@Trifacta"},
		monochrome=false,
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml" }
		)

public class Runner {

	private TestNGCucumberRunner testNGCucumberRunner;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	ReadConfig RC = new ReadConfig();
	public String URL = RC.getApplicationURL();
	public String URL2 = RC.getApplicationURL2();
	public String username = RC.getUsername();
	public String password = RC.getPassword();
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void setUp(String br) {
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+RC.launchChrome());
			driver = new ChromeDriver();
			
		}
		else if(br.equals("headless")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+RC.launchChrome());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless","--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
			driver = new ChromeDriver(options);
			
			
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+RC.launchFireFox());
			driver= new FirefoxDriver();
		}
		else if (br.equals("IE")) {
			System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+RC.launchIE());
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WaitUtil.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WaitUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
	}
	
	
	@Test(groups = "cucumber", description="Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
		
		
	}
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
		driver.quit();
	}
	
	
}

