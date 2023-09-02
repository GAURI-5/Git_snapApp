package com.snap.snapapp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots {

 

    public static void main(String[] args) throws AWTException, InterruptedException {
    	WebDriver driver = new ChromeDriver(); // creating web-driver instance
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

//        Robot robot=new Robot();
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_DOWN);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);    //Username
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);    //Password
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);    //login btn
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        Thread.sleep(1000);
//        
//        WebElement a=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
//        System.out.println(a.getText());

 
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        
        robot.keyPress(KeyEvent.VK_TAB);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        
        WebElement w=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        System.out.println(w.getText());
      
    }

 

}