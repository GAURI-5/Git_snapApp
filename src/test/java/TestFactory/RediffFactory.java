package TestFactory;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffFactory {
	
	

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement redmail;
	
	@FindBy(id="newpasswd")
	WebElement pass;
	
	@FindBy(id="newpasswd1")
	WebElement conpass;
	
	@FindBy(xpath="//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")
	WebElement altmail;
	
	@FindBy(id="mobno")
	WebElement mobno;
	
	@FindBy(xpath="//*[@id=\"signin_info\"]/a[2]")
	WebElement crtacc;
	
	@FindBy(id="Register")
	WebElement register;
	
	public RediffFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clkbtn() {
		crtacc.click();
	}
	public void RediffSearch(String keyword,String redmail1,String pass1,String conpass1,String altmail1) {
		name.sendKeys(keyword);
		redmail.sendKeys(redmail1);
		pass.sendKeys(pass1);
		conpass.sendKeys(conpass1);
		altmail.sendKeys(altmail1);
		
		
	}
	public void register() {
		register.click();
	}
}
