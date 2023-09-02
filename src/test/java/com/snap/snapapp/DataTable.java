package com.snap.snapapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file=new File("C:\\Users\\gatupe\\eclipse-workspace2\\snapapp\\ExcelData\\data1.xls");
//		  FileOutputStream fos= new FileOutputStream(file);
//        Workbook w=new HSSFWorkbook();
//        
//        Sheet s=w.createSheet();
//        
//        s.createRow(0);
//        s.getRow(0).createCell(0).setCellValue("Hello");
//        s.getRow(0).createCell(1).setCellValue("Capg");
//        
//        s.createRow(1);
//        s.getRow(1).createCell(0).setCellValue(true);
//        s.getRow(1).createCell(1).setCellValue(9870);
//        w.write(fos);
//        w.close();
//		
		
		File file1=new File("C:\\Users\\gatupe\\eclipse-workspace2\\snapapp\\ExcelData\\dataset.xlsx");
		FileOutputStream fos1= new FileOutputStream(file1);
        Workbook w1=new XSSFWorkbook();

        Sheet s1=w1.createSheet();

        s1.createRow(0);
        s1.getRow(0).createCell(0).setCellValue("Hello");
        s1.getRow(0).createCell(1).setCellValue("Capg");

        s1.createRow(1);
        s1.getRow(1).createCell(0).setCellValue(true);
        s1.getRow(1).createCell(1).setCellValue(9870);
        
        
        
       

        Sheet s2=w1.createSheet("Testing");

        s2.createRow(0);
        s2.getRow(0).createCell(0).setCellValue("Gauri");
        s2.getRow(0).createCell(1).setCellValue("Tupe");

        
        w1.write(fos1);
        w1.close();
	}

}
