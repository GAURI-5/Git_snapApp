package com.snap.snapapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
		//WebDriverManager.chromedriver().setup();
		
		//driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		//driver.findElement(By.tagName("//a['org/openqa/selenium/package-frame.html']")).click();
		//driver.navigate().back();
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("a")).click();
		//driver.navigate().back();
		Thread.sleep(1000);
	//	driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"runbtn\"]")).click();
		
		System.out.println(driver.getTitle());

	}

}
//<a href="org/openqa/selenium/package-frame.html" target="packageFrame">org.openqa.selenium</a>
