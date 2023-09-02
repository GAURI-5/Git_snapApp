package com.snap.snapapp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void Capture(WebDriver driver) throws IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshot/"+timestamp()+" "+".png"));
    }
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
		
	}
	
