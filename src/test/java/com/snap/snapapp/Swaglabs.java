package com.snap.snapapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
		driver.get("https://www.saucedemo.com/"); 
        driver.manage().window().maximize();
        
//        
//        File file=new File("C:\\\\Users\\\\gatupe\\\\eclipse-workspace2\\\\snapapp\\\\ExcelData\\\\dataset1.xlsx");
//        FileOutputStream fos=new FileOutputStream(file);
//        Workbook w=new XSSFWorkbook();
//        Sheet s=w.createSheet("Testing");
//
//        s.createRow(0);
//        s.getRow(0).createCell(0).setCellValue("standard_user");
//        s.getRow(0).createCell(1).setCellValue("secret_sauce");
//
//        String cellvalue1=s.getRow(0).getCell(0).getStringCellValue();
//        String cellvalue2=s.getRow(0).getCell(1).getStringCellValue();
//
//        driver.findElement(By.id("user-name")).sendKeys(cellvalue1);
//
//      driver.findElement(By.name("password")).sendKeys(cellvalue2);
//
//        w.write(fos);
//        w.close();
//        driver.findElement(By.id("login-button")).click();
	
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
        WebElement uname=driver.findElement(By.id("user-name"));
        js.executeScript("arguments[0].setAttribute('value','standard_user')", uname);
        
        
        Object obj=js.executeScript("return arguments[0].getAttribute('value')",uname);
        
        String s=(String)obj;
        System.out.println(s);
        
        Utility.Capture(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        Utility.Capture(driver);
        driver.close();
	}

}
