package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange1MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				   
				WebDriver driver = new ChromeDriver();
				  
				driver.get("https://www.orangehrm.com/");
			    Thread.sleep(2000);
				WebElement WhyorangeHRM = driver.findElement(By.xpath("//a[text()='Why OrangeHRM']")) ;
				WebElement Partners =  driver.findElement(By.xpath("(//a[text()='Our Partners'])[1]")) ;
				
			    //Thread.sleep(2000);
				
				Actions act = new Actions(driver);
			//	Thread.sleep(2000);
				
				act.moveToElement(WhyorangeHRM).moveToElement(Partners).click().build().perform();
				
				
				
				
	}

}
