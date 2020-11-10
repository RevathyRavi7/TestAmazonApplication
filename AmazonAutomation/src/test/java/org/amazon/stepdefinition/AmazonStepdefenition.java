package org.amazon.stepdefinition;

import org.amazon.runner.AmazonTestRunner;

import java.util.Set;

import org.amazon.pom.AmazonPage;
import org.amazon.pom.PageObjectManager;
import org.maven.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonStepdefenition extends BaseClass {
	
	public static WebDriver driver =AmazonTestRunner.driver;
	public static PageObjectManager pm=new PageObjectManager(driver);
	public static String parent;

@Given("^User should launch the browser and navigate to Amazon application$")
public void user_should_launch_the_browser_and_navigate_to_Amazon_application() throws Throwable {
 
	getUrl("https://www.amazon.in");
}

@When("^User mouseover to the Hello,SignIn text$")
public void user_mouseover_to_the_Hello_SignIn_text() throws Throwable {
	movetoElement(pm.getAp().getMoveToHelloSignIn());
}

@When("^User click on the SignIn button$")
public void user_click_on_the_SignIn_button() throws Throwable {
	elementClick(pm.getAp().getClickSignInButton());
}

@When("^User enter the Email or Mobile Phone Number$") 
public void user_enter_the_Email_or_Mobile_Phone_Number() throws Throwable {
	inputValuestoElement(pm.getAp().getEnterEmailOrPhone(), "8248425288");
}

	 
	 @When("^User click the continue button$") 
public void user_click_the_continue_button() throws Throwable {
		 elementClick(((AmazonPage) pm.getAp()).getClickContinueButton());
	 }
	 
	 @When("^User enter the password in the textbox$") 
public void user_enter_the_password_in_the_textbox() throws Throwable {
		 inputValuestoElement(pm.getAp().getEnterPassword(), "Chennai@123");
	 }
	 
	 @When("^User click the Login Button$") 
public void user_click_the_Login_Button() throws Throwable {
		 elementClick(pm.getAp().getClickLoginButton());
	 }
	 



@When("^User enter product name in search box$")
public void user_enter_product_name_in_search_box() throws Throwable {
	
	inputValuestoElement(pm.getAhp().getEnterProductName(),"mi mobiles");
}

@When("^User click the searched product item$")
public void user_click_the_searched_product_item() throws Throwable {
	elementClick(pm.getAhp().getClickSearchIcon());
	
	//WebElement clickSearch = driver.findElement(By.id("nav-search-submit-text"));
	//clickSearch.click();
	Thread.sleep(2000);
}
	
	  
@When("^User select the searched product and add to cart the product$")
public void user_select_the_searched_product_and_add_to_cart_the_product() throws Throwable {
	parent = driver.getWindowHandle();
	//System.out.println("parent window is" +parent);
 
WebElement selectProduct = driver.findElement(By.xpath("//span[text()='Xiaomi Mi A2 (Gold, 4GB RAM, 64GB Storage)']"));
	
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("argumengts[0].scrollIntoView(true);", selectProduct);
		 */
		 
	 
  selectProduct.click();
		
		 Set<String> allWindows = driver.getWindowHandles(); int count =
		  allWindows.size(); System.out.println("Total window :" +count); 
		  for (String child : allWindows) { 
			  if (!parent.equalsIgnoreCase(child)) {
		  driver.switchTo().window(child);
			 WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		     addToCart.click();
				Thread.sleep(5000);
				
			WebElement addToCartTextMsg =
				 driver.findElement(By.xpath("//*[@id='attachDisplayAddBaseAlert']")); String
				 txt = addToCartTextMsg.getText(); 
				 System.out.println(txt);
		         driver.close();
		    
		 }
		  
	 
			     } 
		  driver.switchTo().window(parent);
		  driver.navigate().back();
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		  
		 
}

@When("^User click the Cart text$")
public void user_click_the_Cart_text() throws Throwable {
	elementClick(pm.getPo().getClickCart());

	
}

@When("^User click proceed to buy button$")
public void user_click_proceed_to_buy_button() throws Throwable {
	elementClick(pm.getPo().getClickProceedToBuy());

	Thread.sleep(1000);
}

	  @When("^User enter the full name$") 
	  public void user_enter_the_full_name() throws Throwable 
	  { 
		  inputValuestoElement(pm.getSa().getEnterFullName(), "Revathy R");

	  }
	 
	 @When("^User enter the mobile no$") 
	 public void user_enter_the_mobile_no()throws Throwable {
	  
 
		 inputValuestoElement(pm.getSa().getEnterMobNo(), "8248425288");
	  }
	  
	  @When("^User enter the pincode$") 
	  public void user_enter_the_pincode() throws Throwable { 

		  inputValuestoElement(pm.getSa().getEnterPinCode(), "600094");
		  }
	  
	  @When("^User enter the houseno$") public void user_enter_the_houseno() throws
	  Throwable { 

		  inputValuestoElement(pm.getSa().getEnterHouseNo(), "No 11 Veerapandi Nagar");
	  }
	  
	  @When("^User enter the Area information$") public void
	  user_enter_the_Area_information() throws Throwable {

		  
		  inputValuestoElement(pm.getSa().getEnterAreaInfo(), "2nd Street,Choolaimedu.");
	  }

	 
	  @And("^User click the Add Address button$")
	  public void user_click_the_Add_Address_button() throws Throwable {
		  
        elementClick(pm.getSa().getClick_AddAddress_Button());
	  
	  
	  }
	  
	  @And("^User click continue button$")
	  public void user_click_continue_button() throws Throwable {
		  elementClick(pm.getSa().getClick_Continue_Button());
		  
	  }
	  
	  @Given("^User select the pay on delivery$")
	  public void user_select_the_pay_on_delivery() throws Throwable {
		  elementClick(pm.getSpm().getSelect_Payment_Method());
	  }
	  

	/*
	 * @When("^User before place the order click continue button$") public void
	 * user_before_place_the_order_click_continue_button() throws Throwable {
	 * elementClick(pm.getSpm().getClick_Continue_Final());
	 * 
	 * }
	 */
	  
	  @Given("^User back to the home page$")
	  public void user_back_to_the_home_page() throws Throwable {
		  driver.navigate().to("https://www.amazon.in");
		  
	  }

	  @Given("^User click delete$")
	  public void user_click_delete() throws Throwable {
	  
	  elementClick(pm.getRp().getClick_Delete());
}
}
	 
	 
	  

 



	


