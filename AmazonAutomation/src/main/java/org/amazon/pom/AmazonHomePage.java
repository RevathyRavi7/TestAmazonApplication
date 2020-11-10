package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	public WebDriver driver;

	@FindBy(id="twotabsearchtextbox")
	private WebElement enterProductName;
	
	@FindBy(id="nav-search-submit-text")
	private WebElement clickSearchIcon;
	


public WebDriver getDriver() {
	return driver;
}

public WebElement getEnterProductName() {
return enterProductName;
}



public WebElement getClickSearchIcon() {
	return clickSearchIcon;
}
public AmazonHomePage(WebDriver hdriver3) {
	this.driver=hdriver3;
		PageFactory.initElements(driver, this);
		
	}

}
