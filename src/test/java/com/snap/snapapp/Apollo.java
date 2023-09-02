package com.snap.snapapp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apollo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		WebDriverManager.chromedriver().setup();
	      
	    driver.findElement(By.xpath("//i[@class=\"icon-ic_medicines Navigation_menuicon__k_X_M\"]//following::p")).click();


	}

}
