package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPaymentMethod {
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Pay on Delivery']")
	private WebElement select_Payment_Method;
	
	@FindBy(xpath="//span[@id='pp-oNYK45-141']")
	private WebElement click_Continue_Final;
	


	public SelectPaymentMethod(WebDriver paymentMethodDriver) {
	this.driver=paymentMethodDriver;
	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect_Payment_Method() {
		return select_Payment_Method;
	}
	
	public WebElement getClick_Continue_Final() {
		return click_Continue_Final;
	}

}
