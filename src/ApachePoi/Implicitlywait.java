package ApachePoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   //implicitly wait-> Maximum waiting time pass
		  // 4.0.0
	//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		   //3.141.59
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		   driver.get("https://www.facebook.com/");
		     
		  WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		  email.sendKeys("mohinimagar@gmail.com");
		  
		  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		  password.sendKeys("3654gcb");
		  
		  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 login.click();
	}

}
