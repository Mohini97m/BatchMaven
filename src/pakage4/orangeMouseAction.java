package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangeMouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.orangehrm.com/");
		   Thread.sleep(2000);
		   
		   
		   WebElement whyorangehrm = driver.findElement(By.xpath("//a[text()='Why OrangeHRM']"));
		   WebElement parnter = driver.findElement(By.xpath("(//li[@class='sub-menu-title menu-title-row pt-2 pb-2'])[6]"));
	       
		   Actions act = new Actions(driver);
		  
		   Thread.sleep(2000);

		  act.moveToElement(whyorangehrm).moveToElement(parnter).click().build().perform();
		  
		  WebElement  platform = driver.findElement(By.xpath("//a[text()='Platform']"));
		  WebElement  talentmanagement = driver.findElement(By.xpath("	(//li[@class='sub-menu-title menu-title-row pt-2 pb-2'])[2]"));
		  Actions act1 = new Actions(driver);
		  
		  Thread.sleep(2000);
		   
		  act1.moveToElement(platform).perform();
		  Thread.sleep(2000);
		   
		  act1.moveToElement(talentmanagement);
		  
		  act1.click().perform();
		   
	
	}
	
	}


