package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
        driver.get("https://www.selenium.dev/"); 
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
        js.executeScript("location.reload()");
        Thread.sleep(1000);
        WebElement a=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a"));
        js.executeScript("arguments[0].click();", a);
        
        js.executeScript("window.scrollBy(200,600)");
        

	}

}
