package org.amazon.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
public WebDriver driver;
private AmazonPage Ap;
private AmazonHomePage Ahp;
private PlaceOrder Po;
private SelectAddress Sa;
private SelectPaymentMethod Spm;
private RemoveProductFromTheCart Rp;




public RemoveProductFromTheCart getRp() {
	if (Rp==null) {
		Rp=new RemoveProductFromTheCart(driver);
	}
	return Rp;
}

public WebDriver getDriver() {
	return driver;
}

public SelectPaymentMethod getSpm() {
	if (Spm==null) {
		Spm= new SelectPaymentMethod(driver);
	}
	return Spm;
}

public SelectAddress getSa() {
	if (Sa==null) {
		Sa=new SelectAddress(driver);
	}

	return Sa;
}

public PageObjectManager(WebDriver pdriver) {
	this.driver=pdriver;
}

public AmazonHomePage getAhp() {
	if(Ahp==null) {
		Ahp=new AmazonHomePage(driver);
	}
	return Ahp;
}

public AmazonPage getAp() {
	if(Ap==null) {
	Ap=new AmazonPage(driver);
	}
	
	return Ap;
}

public PlaceOrder getPo() {
	if(Po==null) {
		Po=new PlaceOrder(driver);
				
	}
	return Po;
}
}


