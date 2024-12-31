package com.fis.pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{

	private By firstResult = By.xpath("//ul[@class='srp-results srp-list clearfix']/li[2]//div[@class='s-item__info clearfix']//a");
	private By addToCartBtn = By.xpath("//span[text()='Add to cart']");
	private By cartSize = By.id("gh-cart-n");
	
	public void clickFirstResult() {
		click(firstResult);
	}
	
	public void clickAddToCart() {
		click(addToCartBtn);
	}
	
	public String getCartSize() {
		return driver.findElement(cartSize).getText();
	}
}
