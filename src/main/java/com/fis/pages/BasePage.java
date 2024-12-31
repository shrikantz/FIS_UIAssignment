package com.fis.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fis.util.ConfigRead;
import com.fis.util.DriverManager;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;
	
	public BasePage() {
		driver = DriverManager.getDriver(ConfigRead.readProp().getProperty("browser"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void click(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public void sendkeys(By locator, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(value);
	}
}
