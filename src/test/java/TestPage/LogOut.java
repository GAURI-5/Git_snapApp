package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	WebDriver driver;
	
	By three=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By log=By.id("logout_sidebar_link");
	
	public LogOut(WebDriver driver) {
		this.driver=driver;
	}
	public void checkout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(three).click();
		
		driver.findElement(log).click();
	}
}
