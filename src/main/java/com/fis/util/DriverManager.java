package com.fis.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

	static WebDriver driver;
	
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("IE")) {
			if(driver==null) {
				System.setProperty("webdriver.ie.driver", "iedriver.exe");
				driver = new InternetExplorerDriver();
			}
		}else if(browser.equalsIgnoreCase("chrome")) {
			if(driver==null) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}
		}else {
			if(driver==null) {
				System.setProperty("webdriver.gecko.driver", "gekodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		
		return null;
	}
	
}
