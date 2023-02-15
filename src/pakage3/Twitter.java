package pakage3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("https://himalayausa.com/");
		   
		   WebElement button = driver.findElement(By.xpath("//button[@data-tooltip='My Account']"));
		   button.click();
		     
		   WebElement register = driver.findElement(By.xpath("(//span[text()='Register'])[2]"));
		   register.click();
		   
		   WebElement FirstName = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		   FirstName.sendKeys("Mohini");
		   
		   WebElement LastName = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		   LastName.sendKeys("Magar");
		   
		   WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
		   email.sendKeys("mohinimagar97@gmail.com");
			
		   WebElement password1 = driver.findElement(By.xpath("//input[@id=\"loginInputPassword\"]"));
		   password1.sendKeys("Mohini@123");
		   
		   WebElement create = driver.findElement(By.xpath("//button[text()='CREATE']"));
		   create.click();
		   
		   WebElement button1 = driver.findElement(By.xpath("(//button[@data-tposition=\"bottom\"])[2]"));
		   button1.click();
		   
		   WebElement signin = driver.findElement(By.xpath("(//button[@data-tposition=\"bottom\"])[2]"));
		   signin.click();
		   
		 //  WebElement signin = driver.findElement(By.xpath("(//button[@data-tposition=\"bottom\"])[2]"));
		  // signin.click();
		    
		   
		     
	}

}
