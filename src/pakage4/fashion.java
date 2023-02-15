package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fashion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(2000);
		   
		   WebElement closelogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		   closelogin.click();
		   Thread.sleep(2000);
		   
		   WebElement electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		   WebElement gaming = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		   WebElement gamingmouse = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]"));
		   
		   Actions x = new Actions(driver);
		   
		   x.moveToElement(electronic).moveToElement(gaming).moveToElement(gamingmouse).click().build().perform();
		   
	//	   x.moveToElement(electronic).perform();
	//	   Thread.sleep(2000);

		//   x.moveToElement(gaming).perform();
	//	   Thread.sleep(2000);

		//   x.moveToElement(gamingmouse).perform();
		//   Thread.sleep(2000);

	//	   x.click().build().perform();


	}

}
