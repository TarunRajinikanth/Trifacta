package com.trifacta.utilities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.trifacta.runner.Runner;



public class BaseClass extends Runner {
	
	
	public void captureScreen(WebDriver driver,String classname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshots\\"+classname+".png");
		FileUtils.copyFile(source, target);
		logg.info("screenshot taken");
		
	}
	
}
