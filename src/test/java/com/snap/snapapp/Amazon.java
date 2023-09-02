package com.snap.snapapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/h2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		
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
		 
		 driver.findElement(By.className("a-icon a-icon-checkbox")).click();
		

	}

}
