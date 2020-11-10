package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
public WebDriver driver;
	

@FindBy(id="nav-cart")
private WebElement clickCart;

@FindBy(xpath="//*[@id='sc-buy-box-ptc-button']")
private WebElement clickProceedToBuy;

public PlaceOrder(WebDriver hdriver4) {
	this.driver=hdriver4;
		PageFactory.initElements(driver, this);
}
public WebElement getClickCart() {
	return clickCart;
}

public WebElement getClickProceedToBuy() {
	return clickProceedToBuy;
}

}
