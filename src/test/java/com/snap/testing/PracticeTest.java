package com.snap.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeTest {
  @Test
  public void fun() throws AWTException, InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();         // creating web-driver instance
      driver.get("https://www.apollo247.com/"); 
      driver.manage().window().maximize();     
 
      driver.findElement(By.xpath("//i[@class=\"icon-ic_medicines Navigation_menuicon__k_X_M\"]//following::p")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("searchProduct")).sendKeys("cold tablets");
      Thread.sleep(1000);
      driver.findElement(By.id("searchProduct")).sendKeys("cold tablets");
      Thread.sleep(2000);
      Robot robot=new Robot();
      robot.keyPress(KeyEvent.VK_ENTER);
      Thread.sleep(1000);
      driver.findElement(By.className("_checkbox_ht9rl_1 _primary_ht9rl_51   ")).click();
   
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,500)");

  }
}
