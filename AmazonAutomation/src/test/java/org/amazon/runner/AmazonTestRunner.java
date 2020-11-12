package org.amazon.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.maven.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src\\test\\java\\org\\amazon\\feature\\",
  tags= {"@AmazonApllication"},
glue="org.amazon.stepdefinition",
dryRun=false,
monochrome=true
)

public class AmazonTestRunner {

	public static WebDriver driver;
	
	  @BeforeClass
	  
	  public static void setUp() throws Exception {
		 // driver.manage().deleteCookieNamed("https://www.amazon.in");
	  driver=BaseClass.browerLaunch("chrome"); driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

	  }
	 
	
	@AfterClass
	
public static void browserQuit() {
driver.quit();
	}

}
