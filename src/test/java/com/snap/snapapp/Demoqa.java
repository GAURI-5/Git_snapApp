package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
        driver.get("https://demoqa.com/alerts"); 
        driver.manage().window().maximize();
        
        driver.findElement(By.id("alertButton")).click();
        String text=driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
        
       driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
       String t=driver.switchTo().alert().getText();
       System.out.println(t);
       Thread.sleep(1000);
       driver.switchTo().alert().accept();
       
        
        driver.findElement(By.id("confirmButton")).click();
        String a=driver.switchTo().alert().getText();
        System.out.println(a);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("promtButton")).click();
        String b=driver.switchTo().alert().getText();
        System.out.println(b);
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Gauri");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
	}

}
