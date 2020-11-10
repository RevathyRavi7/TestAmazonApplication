package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAddress {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	private WebElement enterFullName;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	private WebElement enterMobNo;

	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	private WebElement enterPinCode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	private WebElement enterHouseNo;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
	private WebElement enterAreaInfo;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-top-large a-button-primary']")
	private WebElement click_AddAddress_Button;
	
	@FindBy(xpath="//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]")
	private WebElement click_Continue_Button;
	
	
	public SelectAddress(WebDriver hdriver4) {
	this.driver=hdriver4;
	PageFactory.initElements(driver, this);
	}

public WebDriver getDriver() {
	return driver;
}

	
	public WebElement getEnterFullName() {
		return enterFullName;
	}

	public WebElement getEnterMobNo() {
		return enterMobNo;
	}
    
	public WebElement getEnterPinCode() {
		return enterPinCode;
	}

	public WebElement getEnterHouseNo() {
		return enterHouseNo;
	}

	public WebElement getEnterAreaInfo() {
		return enterAreaInfo;
	}

	public WebElement getClick_AddAddress_Button() {
		return click_AddAddress_Button;
	}
	public WebElement getClick_Continue_Button() {
		return click_Continue_Button;
	}
}
