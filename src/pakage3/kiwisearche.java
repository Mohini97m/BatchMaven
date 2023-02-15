package pakage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class kiwisearche {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://kiwisearches.com/");
		    
		   WebElement firstlastname= driver.findElement(By.xpath("//input[@type=\"text\"]"));
		   firstlastname.sendKeys("Mohini Magar");
		   Thread.sleep(2000);
		   
		   WebElement createaccount= driver.findElement(By.xpath("//span[@class=\"caret\"]"));
		   createaccount.click();
		
	       WebElement state= driver.findElement(By.xpath("//div[@class=\"filter-option-inner-inner\"]"));
	       Select s = new Select(state);
	       s.selectByValue("2");

		   
		   
	}

}
