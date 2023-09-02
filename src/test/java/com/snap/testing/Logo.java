package com.snap.testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();         // creating web-driver instance
      driver.get("https://www.saucedemo.com/"); 
      driver.manage().window().maximize();
  
	  
	  
      WebElement actual=driver.findElement(By.className("login_logo"));
      Assert.assertEquals(true,actual.isDisplayed());
  }
}
