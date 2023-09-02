package com.snap.snapapp;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		//Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement e=driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
        Actions act=new Actions(driver);
        act.moveToElement(e).perform();

        driver.findElement(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")).click();
        //implicit wait
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        
//        WebElement e=driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
//        Actions act=new Actions(driver);
//        act.moveToElement(e).perform();
//
        //explicit wait
    //    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
   //     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"propTypesRent1\\\"]/ul/li[1]/a"))).click();

        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(8));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.withMessage("fluent wait");
        wait.ignoring(NoSuchElementException.class);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")));
	}

}
