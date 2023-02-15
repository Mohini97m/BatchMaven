package Amazon.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountByNikhil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   driver.get("https://www.amazon.in/");
		   
		   WebElement AccountLists = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		   AccountLists.click();
		  
		   WebElement createaccount = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		   createaccount.click();
		  
		   WebElement FirstandLastname = driver.findElement(By.xpath("//input[@placeholder='First and last name']"));
		   FirstandLastname.sendKeys("Mohini Magar");
	
		   WebElement DropDown = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		   DropDown.click();

		   WebElement India = driver.findElement(By.xpath("(//a[@tabindex='-1'])[94]"));
		   India.click();
	        Thread.sleep(2000);
		   WebElement mobileno = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		   mobileno.sendKeys("82374876");
		 
		   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("mohini@123");
	
		   WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		   Continue.click();
	}

}
