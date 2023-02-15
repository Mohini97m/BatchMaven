package package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v108.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
			WebDriver driver = new ChromeDriver();  
			driver.get("https://www.facebook.com/");
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		    createAcc.click();
		    
			WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[2]")) ;
			FirstName.sendKeys("ambani");
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			
			act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		 
		    act.sendKeys(Keys.TAB).build().perform();	
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}
