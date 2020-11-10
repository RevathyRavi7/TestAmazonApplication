package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	
	public WebDriver driver;

	
	@FindBy(id="nav-link-accountList")
	private WebElement moveToHelloSignIn;
	
	@FindBy(className="nav-action-inner")
	private WebElement clickSignInButton;
	
	@FindBy(id="ap_email")
	private WebElement enterEmailOrPhone;
	
	@FindBy(id="continue")
	private WebElement clickContinueButton;
	
	@FindBy(id="ap_password")
	private WebElement enterPassword;
	
	@FindBy(id="signInSubmit")
	private WebElement clickLoginButton;
	


	public WebDriver getDriver() {
		return driver;
	}

   public WebElement getMoveToHelloSignIn() {
		return moveToHelloSignIn;
	}

	public WebElement getClickSignInButton() {
		return clickSignInButton;
	}
	
	public WebElement getEnterEmailOrPhone() {
		return enterEmailOrPhone;
	}
	
	public WebElement getClickContinueButton() {
		return clickContinueButton;
	}


   public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickLoginButton() {
		return clickLoginButton;
	}



	public AmazonPage(WebDriver hdriver2) {
		
		this.driver=hdriver2;
		PageFactory.initElements(driver, this);
	}



	
	
	
	

}
