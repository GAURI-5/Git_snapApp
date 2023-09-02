package TestFactory;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BurgerPF {
	WebDriver driver;
	BurgerFactory bf;
  @Test
 public void verifyBurger() throws InterruptedException, AWTException {
	  
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.burgerking.in/");
		driver.manage().window().maximize();
		
		bf=new BurgerFactory(driver);
		

		bf.clickbtn();
		bf.mobile("9096692860", "rabale police station");
		bf.scroll();
		
		bf.home("Don't add onion");

}}
