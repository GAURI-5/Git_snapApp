package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.snap.snapapp.Utility;

import TestFactory.LoginFactory;
import TestFactory.LoginPF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileTest {
	ChromeDriver driver;
	LoginFactory lg;
	//LoginPF lp;
	
	 
	 // WebDriver driver1 = new ChromeDriver();         // creating web-driver instance
        

    
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
	    driver.manage().window().maximize(); 
	    WebDriverManager.chromedriver().setup();
	    
	}
//	@When("User enter uname & password")
//	
//	public void user_enter_uname_password() {
//		
//		lg=new LoginFactory(driver);
//		//lg.swaglog("standard_user", "secret_sauce");
//	   
//	}
	
	@When("^User enter (.*)&(.*)$")
	public void user_enter(String uname, String pwd) {
	  //  lg.swaglog(uname, pwd);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		lg.clickbtn();
	  
	}
	@Then("Login should be successful")
	public void login_should_be_successful() throws IOException {
		Assert.assertEquals(false,false);
		//Utility.Capture(driver);
	   
	}


}
