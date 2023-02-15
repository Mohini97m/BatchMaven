package ApachePoi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePoi2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 Thread.sleep(2000);
		 String path ="C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files\\Test1.xlsx";
		
		    InputStream file = new FileInputStream(path);
			Sheet sheet = WorkbookFactory.create(file).getSheet("Velocity");
			int lastRow = sheet.getLastRowNum();
			
			for(int i = 2 ; i<=lastRow+1; i++)
			{
				int lastCellNumber = sheet.getRow(i-1).getLastCellNum();
				
				for(int j=0; j<=lastCellNumber-1; j++) 
				{
				List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));
			    String t = list.get(j).getText();
			    String d = sheet.getRow(i-1).getCell(j).getStringCellValue();
				
			    if(t.equals(d))
			    {
			    	System.out.println(d + " // Displayed as //" +t+  "=Pass");
			    }
			    else
			    {
			    	System.out.println(d + "//Displayed as //" +t+  "=Fail");
			    }
				}
			}
	}

}
