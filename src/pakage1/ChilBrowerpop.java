package pakage1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChilBrowerpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.facebook.com");
		   
		   WebElement metaPay = driver.findElement(By.xpath("//a[text()='Meta Pay']")); 
		   metaPay.click();
		   WebElement  portal = driver.findElement(By.xpath("//a[text()='Portal']")); 
		   portal.click();
		   
		   ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(add.get(1));
		   
	}

}
