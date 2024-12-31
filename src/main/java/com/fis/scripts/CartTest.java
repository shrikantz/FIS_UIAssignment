package com.fis.scripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fis.pages.HomePage;
import com.fis.pages.SearchResultPage;
import com.fis.util.ConfigRead;
import com.fis.util.DriverManager;

public class CartTest {

	HomePage homePage = new HomePage();
	SearchResultPage searchResultPage = new SearchResultPage();
	WebDriver driver;
	
	@BeforeMethod
	public void before() {
		driver = DriverManager.getDriver(ConfigRead.readProp().getProperty("browser"));
		System.out.println(ConfigRead.readProp().getProperty("browser"));
		driver.get(ConfigRead.readProp().getProperty("AppURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void verifyCart() {
		homePage.searchProduct(ConfigRead.readProp().getProperty("product"));
		
		searchResultPage.clickFirstResult();
		searchResultPage.clickAddToCart();
		String cartSize = searchResultPage.getCartSize();
		assertEquals(cartSize, ConfigRead.readProp().getProperty("cartSize"));
	}
	
	@AfterMethod
	public void after() {
		driver.close();
	}
}
