package pakage3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

		public static void main(String[] args) throws InterruptedException {
				
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   
			   WebDriver driver = new ChromeDriver();
			 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   driver.get("https://www.telegram.com/");
			     
			  WebElement signbutton = driver.findElement(By.xpath("//a[@class=\"gnt_n_us_a gnt_n_mn_ce\"]"));
			  signbutton.click();
			  
			  WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create account']"));
			  createAcc.click();
			  
			  WebElement FirstName = driver.findElement(By.xpath("//input[@title=\'First Name\']"));
			  FirstName.sendKeys("Mohini");
			  
			  WebElement LastName = driver.findElement(By.xpath("//input[@title=\'Last Name\']"));
			  LastName.sendKeys("Magar");
			  
			  WebElement createEmail = driver.findElement(By.xpath("//input[@title=\'Account Username\']"));
			  createEmail.sendKeys("mohinimagar97@gmail.com");
			  
			  WebElement createPassword = driver.findElement(By.xpath("//input[@type='password']"));
			  createPassword.sendKeys("Mohini@123");
			  
			  WebElement Reenterpassword = driver.findElement(By.xpath("//input[@title=\"Re-enter Password\"]"));
			  Reenterpassword.sendKeys("Mohini@123");
			  
			  WebElement createAcc1 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
			  createAcc1.click();
			  
			  WebElement signin = driver.findElement(By.xpath("//span[text()='Sign in']"));
			  signin.click();
			  
			//  WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
			  //signout.click();
			  
			//  Thread.sleep(2000);
			  
			//  WebElement signin1 = driver.findElement(By.xpath("//a[text()='Sign In']"));
			  //signin1.click();
			  
			//  WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			 // email.sendKeys("mohinimagar97@gmail.com");
			  
			//  WebElement password1 = driver.findElement(By.xpath("//input[@type=\"password\"]"));
			 // password1.sendKeys("Mohini@123");
			  
			 // WebElement submit = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
			 // submit.click();
			  
			  
	}

}
