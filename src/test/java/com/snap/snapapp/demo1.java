package com.snap.snapapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//Actions act=new Actions(driver);
		
		driver.findElement(By.id("inputValEnter")).sendKeys("mobiles");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("product-title")).click();
		
		 Robot robot=new Robot();
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 
		 //Actions act=new Actions(driver);
		// WebElement btnn=driver.findElement(By.className("grey-contnr clearfix "));
		// act.moveToElement(btnn).build().perform();
		// System.out.println(btnn.getTagName());
		 //Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"pincode-check\"]")).sendKeys("400708");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		//js.executeScript("window.scrollBy(0,250)"," ");
	//	driver.findElement(By.xpath("//*[@id=\"bundledCartForm\"]")).click();
	//	System.out.println("hi");
		driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]/span")).click();
		

		
		

	}

}
