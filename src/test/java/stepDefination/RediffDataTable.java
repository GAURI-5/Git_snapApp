package stepDefination;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import TestFactory.RediffFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffDataTable {
	ChromeDriver driver;
	RediffFactory red;
	
	@Given("user is on the home page of Rediff")
	public void user_is_on_the_home_page_of_rediff() {
		driver = new ChromeDriver(); 
		driver.get("https://www.Rediff.com/"); 
	    driver.manage().window().maximize(); 
	    WebDriverManager.chromedriver().setup();
	}
	@When("User enter keyword")
	public void user_enter_keyword(DataTable keyword) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    red=new RediffFactory(driver);
	    List<String>cells=keyword.asList(String.class);
	   // red.RediffSearch(cells.get(1));
	}
	@And("User clicks on search btn")
	public void user_clicks_on_search_btn() {
		red.clkbtn();
	}
	@Then("Search should be successful")
	public void search_should_be_successful() {
		driver.close();
	}



}
