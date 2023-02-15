package pakage4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		   
		   WebElement signin = driver.findElement(By.xpath("//input[@type='submit']"));
		   signin.click();
		   Thread.sleep(2000);
		  
	     // driver.switchTo().alert();
		 
		   Alert alt = driver.switchTo().alert();
	   String text =  alt.getText(); 
	   System.out.println(text);
	   
	
		   
	}

}
