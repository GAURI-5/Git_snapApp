package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazo {


	public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();         // creating web-driver instance

	        driver.get("https://www.amazon.in/");      // navigate to web page

	        driver.manage().window().maximize();


	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");

	        Thread.sleep(1000);


	        driver.findElement(By.id("nav-search-submit-button")).click();

	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();

	        Thread.sleep(2000);


//	        driver.findElement(By.xpath("//*[@id=\"dealsx_atc_btn\"]/span/a")).click();

//	        Thread.sleep(2000);


	        driver.switchTo().window(driver.getWindowHandle());

	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i")).click();

	        Thread.sleep(2000);


	        driver.findElement(By.xpath("//*[@id=\"p_n_feature_three_browse-bin/9141486031\"]/span/a/div/label/i")).click();

	        Thread.sleep(3000);


	        driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")).click();

	        Thread.sleep(2000);


	        JavascriptExecutor js=(JavascriptExecutor)driver;

	        js.executeScript("window.scrollBy(0,1000)");


	    }

}
