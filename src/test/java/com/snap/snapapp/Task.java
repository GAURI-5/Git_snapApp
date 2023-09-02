package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
        driver.get("https://jqueryui.com/droppable/"); 
        driver.manage().window().maximize();

        driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);

        act.dragAndDrop(source, destination).perform();

        if(destination.getText().matches("Dropped!")) {
            System.out.println("Sucessfully dropped");
        }
	}}
