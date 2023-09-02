package com.snap.snapapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();         // creating web-driver instance

		        driver.get("https://www.ebay.com/"); 

		        driver.manage().window().maximize();


		        WebElement e=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

		        Actions act=new Actions(driver);

		        act.moveToElement(e).build().perform();
		       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainContent\"]"))).click();

		        driver.findElement(By.xpath("")).click();

	}

}
