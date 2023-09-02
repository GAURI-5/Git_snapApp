//package steps;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import TestFactory.RediffFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class RediffTest {
//	ChromeDriver driver;
//	RediffFactory red;
//	
//	@Given("user is on the home page of Rediff")
//	public void user_is_on_the_home_page_of_rediff() {
//		driver = new ChromeDriver(); 
//		driver.get("https://www.Rediff.com/"); 
//	    driver.manage().window().maximize(); 
//	    WebDriverManager.chromedriver().setup();
//	  
//	}
//	@When("^User enter (.*)$")
//	public void user_enter(String keyword) {
//		red=new RediffFactory(driver);
//	  red.RediffSearch(keyword);
//	}
//	@And("User clicks on search btn")
//	public void user_clicks_on_search_btn() {
//		red.clkbtn();
//	    
//	}
//	@Then("Search should be successful")
//	public void search_should_be_successful() {
//		driver.close();
//	   
//	}
//
//
//}
