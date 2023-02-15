package pakage4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class htmltablehandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   Thread.sleep(3000);
		   
	      List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//td"));
		   
	      Thread.sleep(2000);
	      
		   int noofcells = cells.size();
		   System.out.println(noofcells);
		   
		   for(int i=0; i<noofcells; i++)
		   {
		   List<WebElement> cell = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr["+ i +"]//td"));
			   
			   WebElement x = cells.get(i);
			    String t = x.getText();
			  
			  System.out.println(t.toCharArray());
			  String q=t;
			 //   System.out.println(cells.get(i).getText());
			    
		
		       if (t.equals(q))
		       {
		    	 
		    	   System.out.print("Pass " );
		       }
		       else
		      {
		    	   System.out.print("Fail ");
		       }
			  
		   }
	}
}
	


