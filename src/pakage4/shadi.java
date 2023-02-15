package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shadi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.shaadi.com/lets-begin/matrimonia");
		   
		   WebElement gend = driver.findElement(By.xpath("(//span[@class='Dropdown-arrow'])[1]"));
		   gend.click();
		   
		  Thread.sleep(2000);
		  
		   WebElement wom= driver.findElement(By.xpath("(//div[text()='Woman'])[1]"));
		   wom.click();
		  
		   WebElement age= driver.findElement(By.xpath("(//span[@class='Dropdown-arrow'])[2]"));
		    age.click();

		   WebElement age1= driver.findElement(By.xpath("//div[text()='22']"));
		   age1.click();
		 
		//   WebElement age2= driver.findElement(By.xpath("(//span[@class='Dropdown-arrow'])[1]"));
		 //  age1.click();
		   
		 //  WebElement age3= driver.findElement(By.xpath("//div[text()='45']"));
		  // age1.click();
	}

}
