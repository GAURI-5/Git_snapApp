package com.snap.testing;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void firstMethod() {
	  WebDriver driver = new ChromeDriver();         // creating web-driver instance

      driver.get("https://google.com/"); 

      driver.manage().window().maximize();

      String expectedtitle="google.com";
      String actualtitle=driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle);
      
      
      String expurl="https://www.google.com/";
      String acturl=driver.getCurrentUrl();
      SoftAssert soft=new SoftAssert();
      soft.assertEquals(acturl, expurl);
      soft.assertAll();
      
    //hard Assert
      String expectedTitle="Google";
      String actualTitle=driver.getTitle();
      Assert.assertEquals(actualTitle,expectedTitle);
  }
}
