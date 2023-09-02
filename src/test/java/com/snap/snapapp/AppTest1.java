package com.snap.snapapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/select-menu");
	//	driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		
		WebDriverManager.chromedriver().setup();

		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Ima")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.navigate().to("https://www.google.com/");
//		driver.findElement(By.partialLinkText("Ima")).click();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);	
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
		
		
//		System.out.println("The title is: "+driver.getTitle());
//		System.out.println("Url is: "+driver.getCurrentUrl());
//		
//		
//		String title=driver.getTitle();
//		System.out.println("The title is: "+driver.getTitle());
//		
//		WebElement a=driver.findElement(By.id("user-name"));
//		System.out.println(a.getAttribute("class"));
//		System.out.println(a.getTagName());
//		System.out.println(a.getCssValue("font-family"));
//		
//		System.out.println(a.getCssValue("width"));
//		
//		
//		String text=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getText();
//		System.out.println(text);
		
		//WebElement l=driver.findElement(By.id("login-button"));
//		System.out.println(l.isDisplayed());
//		System.out.println(l.isSelected());
//		System.out.println(l.isEnabled());	
		
		
		
//		driver.get("https://demoqa.com/select-menu");
//		driver.manage().window().maximize();
//		
//		WebElement e=driver.findElement(By.cssSelector("#cars"));
//		Select s=new Select(e);
//		
//		boolean b=s.isMultiple();
//		System.out.println(b);
//		
//		s.selectByIndex(2);
//		s.selectByValue("volvo");
//		s.selectByVisibleText("saab");
//		
//		s.deselectByIndex(2);
//		s.deselectByValue("saab");
//		s.deselectByVisibleText("volvo");
		
		
//		WebElement e=driver.findElement(By.cssSelector("#cars"));
//		Select s=new Select(e);
//		boolean b=s.isMultiple();
//		System.out.println(b);
//		
//		List<WebElement>opt=s.getOptions();
//		System.out.println(opt.size());
//		
//		for(WebElement e2: opt) {
//			String t=e2.getText();
//			System.out.println(t);
//		}
//		
//		System.out.println("first selected");
//		
//		s.selectByIndex(1);
//		s.selectByValue("audi");
//		
//		
//		WebElement d=s.getFirstSelectedOption();
//		String first=d.getAttribute("value");
//		System.out.println(first);
//		
//		List<WebElement> all=s.getAllSelectedOptions();
//		System.out.println(all.size());
//		
//		s.deselectAll();
//
//		List<WebElement> all1=s.getAllSelectedOptions();
//		System.out.println(all1.size());
//		
		
	//	driver.get("https://www.saucedemo.com/");
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
//		WebElement uname=driver.findElement(By.id("user-name"));
//		uname.click();
//		act.moveToElement(uname).sendKeys("standard_user").build().perform();
//		
//		WebElement pwd=driver.findElement(By.id("password"));
//		pwd.click();
//		act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
//		
//		WebElement log=driver.findElement(By.id("login-button"));
//	
//		act.moveToElement(log).click().build().perform();
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		act.sendKeys(Keys.TAB).build().perform();
//		
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		
//		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
//		WebElement run=driver.findElement(By.id("runbtn"));
//		run.click();
//		WebElement link=driver.findElement(By.tagName("a"));
//		link.click();
		driver.findElement(By.tagName("a")).click();
		
	}

}
