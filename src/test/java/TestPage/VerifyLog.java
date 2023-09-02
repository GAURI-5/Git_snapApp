package TestPage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {
	WebDriver driver=null;
	LogPage lp;
	HomePage hp;
	LogOut lo;
	
	@Test
	public void testLog() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		lp=new LogPage(driver);
		hp=new HomePage(driver);
		lo=new LogOut(driver);
		
		//lp.typelog("problem_user", "secret_sauce");
		
		lp.typeuser();
		lp.typepass();
		lp.clickBtn();
		
		
		hp.homepage();
		
		lo.checkout();
		
		
	}
}
