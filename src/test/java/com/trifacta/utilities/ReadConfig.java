package com.trifacta.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig()  {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL() {
		String URL = prop.getProperty("url");
		return URL;
	}
	public String getApplicationURL2() {
		String URL2 = prop.getProperty("url2");
		return URL2;
	}
	public String getUsername() {
		String uname = prop.getProperty("username");
		return uname;
	}
	public String getPassword() {
		String pswd = prop.getProperty("password");
		return pswd;
	}
	public String launchChrome() {
		String chrome = prop.getProperty("chromepath");
		return chrome;
	}
	public String launchIE() {
		String IEpath = prop.getProperty("iepath");
		return IEpath;
	}
	
	public String launchFireFox() {
		String firefox = prop.getProperty("firefoxpath");
		return firefox;
	}
}
