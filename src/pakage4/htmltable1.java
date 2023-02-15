package pakage4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class htmltable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   Thread.sleep(3000);
		   
	      
	   	List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
		   
	      Thread.sleep(2000);
	      
		   int noofcells = cells.size();
		   System.out.println(noofcells);
		   
		   for(int i=0; i<noofcells; i++)
		   {
			   WebElement x = cells.get(i);
			    String t = x.getText();
			 // System.out.println(cells.get(i));
			    System.out.println(t);
		   }
	}

}
