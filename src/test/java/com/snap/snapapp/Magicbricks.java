package com.snap.snapapp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Magicbricks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		   Actions act=new Actions(driver);
		   
		   String parenthandle=driver.getWindowHandle();
		   System.out.println("parent window "+parenthandle);
//		
//		driver.findElement(By.id("buyheading")).click();
//		driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/flats-in-mumbai-for-sale-pppfs']")).click();
	
		  WebElement buy=driver.findElement(By.id("buyheading"));
	        act.moveToElement(buy).build().perform();
	        driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/flats-in-mumbai-for-sale-pppfs']")).click();
	        Thread.sleep(2000);
	        
	        Set<String> handles = driver.getWindowHandles();

	        

	        for (String h : handles) {
	            System.out.println(h);
	        }
	        
	        
	        
		

	}

}
