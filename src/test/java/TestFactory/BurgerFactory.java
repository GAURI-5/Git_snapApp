package TestFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerFactory {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[3]/span") WebElement login;
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[2]/section[3]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/button/div")WebElement add;
	@FindBy(id="mobileNumber")WebElement number;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/button")WebElement otp;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/button")WebElement verifyotp;
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[4]/div/div[2]/div/div[2]")WebElement addtocart;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[4]/span")WebElement viewcart;
	@FindBy(id="instructionInputData")WebElement instruction;
	@FindBy(xpath="JavascriptExecutor js = (JavascriptExecutor) driver;")WebElement address;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div/div[3]/div/div[2]/div/div/div/div[4]/div/div/div[2]/p[2]")WebElement selectadd;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div/div[1]/div/div/div[5]/button")WebElement payment;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div[3]/span")WebElement selAddress;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[1]/input")WebElement addAddress;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/button/span")WebElement confirm;
	public BurgerFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickbtn() {
		login.click();
	}
	public void mobile(String num,String addre) throws InterruptedException, AWTException {
		Thread.sleep(10000);
		number.sendKeys(num);
		otp.click();
		Thread.sleep(15000);
		verifyotp.click();
		Thread.sleep(8000);
		selAddress.click();
		Thread.sleep(4000);
		addAddress.sendKeys(addre);
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		confirm.click();
		Thread.sleep(2000);
		
		
	
		}
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	public void home(String inst) throws InterruptedException {
		Thread.sleep(3000);
		add.click();
		addtocart.click();
		viewcart.click();
		instruction.sendKeys(inst);
		Thread.sleep(3000);
		address.click();
		selectadd.click();
		scroll();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		payment.click();
		
		
	}

	
		


}
