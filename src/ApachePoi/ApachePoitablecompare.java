package ApachePoi;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ApachePoitablecompare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> celldata = driver.findElements(By.xpath("//table[@class='ws-table-all']")); 
		List<String> data = Arrays.asList("Alfreds Futterkiste", "Maria Anders","Germany",
				"Centro comercial Moctezuma","Francisco Chang","Mexico",
			    "Ernst Handel",	"Roland Mendel"	,"Austria",
		        "Island Trading","Helen Bennett","UK",
				"Laughing Bacchus Winecellars",	"Yoshi Tannamuri","Canada",
				"Magazzini Alimentari Riuniti",	"Giovanni Rovelli","Italy");
	
		int noofcells = celldata.size();
		   System.out.println(noofcells);
		   Thread.sleep(1000);
		   
		   for(int i=0; i<noofcells; i++)
		   {
			   WebElement x = celldata.get(i);
			    String t = x.getText();
			    String d = data.get(i);
			    boolean condition = t.equals(d);
		   
		   if (condition == true)
	       {
	    	 
	    	   System.out.print("Pass" + d );
	       }
	       else
	      {
	    	   System.out.print("Fail" + d );
	       }
	    }
		  
	}
}

