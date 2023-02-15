package ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePoiComparetable {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.w3schools.com/html/html_tables.asp");
	 
	 String path ="C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Test1.xlsx";
	
	    InputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Velocity");
		
		int rowCount = sheet.getLastRowNum();
		int  colCount = sheet.getRow(1).getLastCellNum();
		
		System.out.println("rowCount :- " + rowCount + " ,  colCount :- " + colCount);

		for(int i=0; i<=rowCount; i++)
		{
			Row celldata = sheet.getRow(i);
			
			String data1 = celldata.getCell(0).getStringCellValue();
			String data2 = celldata.getCell(1).getStringCellValue();
			String data3 = celldata.getCell(2).getStringCellValue();
			//String data4 = celldata.getCell(3).getStringCellValue();
			//driver.findElement(By.xpath("//table[@class='ws-table-all']"));
			
			System.out.println(i+"."+data1+" || "+data2+ " || " +data3 );
		}
}
}