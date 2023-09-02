package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import TestFactory.RediffFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffAcc {
	ChromeDriver driver;
	RediffFactory red;

	
	@Given("user should be on homepage")
	public void user_should_be_on_homepage() {
		driver = new ChromeDriver(); 
		driver.get("https://register.rediff.com/"); 
	    driver.manage().window().maximize(); 
	    WebDriverManager.chromedriver().setup();
	  
	}
	@When("user should click create account link")
	public void user_should_click_create_account_link() {
		red=new RediffFactory(driver);
		red.clkbtn();
	   
	}
	@When("user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1")
	public void user_enters_full_keyword_redmail1_pass1_conpass1_altmail1_mobno1() throws IOException {
		red=new RediffFactory(driver);

	
		File file1=new File("C:\\Users\\gatupe\\eclipse-workspace2\\snapapp\\ExcelData\\dataset.xlsx");
		FileInputStream fos=new FileInputStream(file1);
		Workbook w=new XSSFWorkbook(fos);
		Sheet s=w.getSheetAt(0);
		//System.out.println(s);
		String cv1=s.getRow(0).getCell(0).getStringCellValue();
		String cv2=s.getRow(0).getCell(1).getStringCellValue();
		String cv3=s.getRow(0).getCell(2).getStringCellValue();
		String cv4=s.getRow(0).getCell(3).getStringCellValue();
		String cv5=s.getRow(0).getCell(4).getStringCellValue();
		
		red.RediffSearch(cv1, cv2, cv3, cv4,cv5);
	
	
	
//	@When("user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1")
//    public void user_enters_full_keyword_redmail1_pass1_conpass1_altmail1_mobno1(DataTable key) {
//        red=new RediffFactory(driver);
//        List<List<String>> list=key.asLists(String.class);
//      for (List<String> columns : list) 
//       red.RediffSearch(columns.get(0), columns.get(1), columns.get(2), columns.get(3), columns.get(4));
    }
	@And("click on create my account button")
	public void click_on_create_my_account_button() {
		red.register();
	
	}
	@Then("The message box should display")
	public void the_message_box_should_display() {
		//driver.close();
	    
	}


}
