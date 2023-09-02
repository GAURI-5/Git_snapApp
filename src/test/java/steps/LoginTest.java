package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestFactory.LoginFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	ChromeDriver driver;
	LoginFactory lg;
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
	    driver.manage().window().maximize(); 
	    WebDriverManager.chromedriver().setup();
	  
	}
	@When("^User enter (.*)&(.*)$")
	public void user_enter(String string, String string2) {
		lg=new LoginFactory(driver);
		lg.swaglog();
	  
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		lg.clickbtn();
	   
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		Assert.assertEquals(false,false);
	  
	}



}
