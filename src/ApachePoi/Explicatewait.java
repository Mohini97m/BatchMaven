package ApachePoi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicatewait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 //Explicit wait--> Waiting time + condition
		 
		 //3.141.59 		                 //webdriver , long
       //  WebDriverWait wait1 = 	new WebDriverWait(driver , 20);
         
         //4.7.0               //Total maximum waiting time = 20 
         WebDriverWait wait = 	new WebDriverWait(driver , Duration.ofSeconds(20));
        
         WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
          email.sendKeys("mohini123@gmail.com");
		  
		  WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		  password.sendKeys("26776gf");
		  
		  WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		  login.click();
		  
	}

}

