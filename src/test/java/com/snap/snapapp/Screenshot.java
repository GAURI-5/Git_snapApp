package com.snap.snapapp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // creating web-driver instance
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
//        TakesScreenshot ts=(TakesScreenshot)driver;
//        File file=ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("./Screenshots/image.png"));
//        driver.close();
//        Utils.CaptureScreenshot11(driver,"BeforeLogin");
//        driver.findElement(By.id("login-button"));
//        Utils.CaptureScreenshot11(driver,"AfterLogin");
        driver.close();
	}

}
