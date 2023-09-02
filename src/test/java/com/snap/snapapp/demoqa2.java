package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
        driver.get("https://demoqa.com/automation-practice-form"); 
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
        WebElement name=driver.findElement(By.id("firstName"));
        js.executeScript("arguments[0].setAttribute('value','Gauri')", name);
        WebElement surname=driver.findElement(By.id("lastName"));
        js.executeScript("arguments[0].setAttribute('value1','Tupe')", surname);
        
        Object obj=js.executeScript("return arguments[0].getAttribute('value')",name);
        Object obj1=js.executeScript("return arguments[0].getAttribute('value1')",surname);
        String s=(String)obj;
        String s1=(String)obj1;
        System.out.println(s);
        System.out.println(s1);
        
	}

}
