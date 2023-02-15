package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pcj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.pcjeweller.com/");
		   
		   Thread.sleep(2000);
		   
		   WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		   register.click();
		   
		   Thread.sleep(2000);
		   
		//  WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		  // signup.click();
		   
		//  Thread.sleep(2000);
		  
		  WebElement name = driver.findElement(By.xpath("(//input[@class='c-input'])[4]"));
		   name.sendKeys("Vedika");
		   
		   Thread.sleep(2000);
		   
		 //  WebElement emailId = driver.findElement(By.xpath("//label[text()='Email Address']"));
		  // emailId.sendKeys("Magar");
	}

}
