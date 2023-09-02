package com.snap.snapapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebDriverManager.chromedriver().setup();
		
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"));
		//act.moveToElement(a).click().build().perform();
		//act.doubleClick(a).build().perform();
		
		act.contextClick(a).build().perform();
}}
