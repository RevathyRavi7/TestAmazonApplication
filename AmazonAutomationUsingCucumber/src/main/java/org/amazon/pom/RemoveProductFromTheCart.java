package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromTheCart {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@aria-label='Delete Xiaomi Mi A2 (Gold, 4GB RAM, 64GB Storage)']")
	private WebElement click_Delete;
	
	public RemoveProductFromTheCart(WebDriver removeProduct) {
		this.driver=removeProduct;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_Delete() {
		return click_Delete;
	}

}
