package com.fis.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By searchTbx = By.name("_nkw");
	private By searchBtn = By.id("gh-btn");

	/**
	 * To search product
	 * @param product
	 */
	public void searchProduct(String product) {
		sendkeys(searchTbx, product);
		click(searchBtn);
	}
}
