package TestPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.snap.snapapp.Robots;

public class HomePage {
	WebDriver driver;
	
	By filter=By.className("product_sort_container");
	By sel=By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[2]");
	By proclk=By.xpath("//*[@id=\"item_3_title_link\"]/div");
	By add=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By cart=By.className("shopping_cart_link");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void homepage() throws AWTException, InterruptedException {
		driver.findElement(filter).click();
		 Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		driver.findElement(proclk).click();
		Thread.sleep(2000);
		driver.findElement(add).click();
		driver.findElement(cart).click();
	}
	
}
