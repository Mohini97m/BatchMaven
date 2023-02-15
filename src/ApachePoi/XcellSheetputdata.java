package ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XcellSheetputdata {

	public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
      
      HSSFWorkbook workbook = new HSSFWorkbook(); 
      
      HSSFSheet sheet = workbook.createSheet(); 
      
      sheet.createRow(0);
      sheet.getRow(0).createCell(0).setCellValue("First ");
      sheet.getRow(0).createCell(1).setCellValue("Last");
      sheet.getRow(0).createCell(2).setCellValue("Points");
      
      sheet.createRow(1);
      sheet.getRow(1).createCell(0).setCellValue("Jill");
      sheet.getRow(1).createCell(1).setCellValue("Smith");
      sheet.getRow(1).createCell(2).setCellValue("50");
      
      sheet.createRow(2);
      sheet.getRow(2).createCell(0).setCellValue("Eve");
      sheet.getRow(2).createCell(1).setCellValue("Jackson");
      sheet.getRow(2).createCell(2).setCellValue("94");
      
      sheet.createRow(3);
      sheet.getRow(3).createCell(0).setCellValue(" Adam");
      sheet.getRow(3).createCell(1).setCellValue("Johnson" );
      sheet.getRow(3).createCell(2).setCellValue("67");
      
      sheet.createRow(4);
      sheet.getRow(4).createCell(0).setCellValue("Bo");
      sheet.getRow(4).createCell(1).setCellValue("Nilsson" );
      sheet.getRow(4).createCell(2).setCellValue("57");
      
      sheet.createRow(5);
      sheet.getRow(5).createCell(0).setCellValue("Mike");
      sheet.getRow(5).createCell(1).setCellValue("Ross" );
      sheet.getRow(5).createCell(2).setCellValue("35");

      sheet.createRow(6);
      sheet.getRow(6).createCell(0).setCellValue("Mohini");
      sheet.getRow(6).createCell(1).setCellValue("Magar" );
      sheet.getRow(6).createCell(2).setCellValue("30");  
      
      File file = new File ("C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Excell\\Data1.xls");
		 
         workbook.write(file); 
   	     workbook.close(); 
         System.out.println("ExcelSheet1.xlsx written successfully"); 
    
	
	}

	
	
		
	}


