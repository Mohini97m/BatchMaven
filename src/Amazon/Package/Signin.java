package Amazon.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   driver.get("https://www.amazon.in/");
		   
		   WebElement signin = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		   signin.click();
		   Thread.sleep(2000);
		   WebElement emailmobileno = driver.findElement(By.xpath("//input[@type='email']"));
		   emailmobileno.sendKeys("mohinimagar97@gmail.com");
		   
		   WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		   Continue.click();
		   
		   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("Mohini@123");
	
		   WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		   submit.click();
	
		   WebElement searchbar = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		   searchbar.sendKeys("mobile phone");
		   
		   WebElement search = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		   search.click();
		   
		   WebElement mobiledynamic = driver.findElement(By.xpath("(//div[@id='a-page']//span)[135]"));
		   mobiledynamic.click();
		   Thread.sleep(1000);
		  
		   WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		   price.click();
		   
		   System.out.println(price.getText());  

		   WebElement addtocard = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		   addtocard.click();
	
	}

}
