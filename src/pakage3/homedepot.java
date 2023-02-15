package pakage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepot {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.homedepot.com/");
		    
		   WebElement myaccount= driver.findElement(By.xpath("(//div[@class=\"MyAccount__icon\"])[1]"));
		   myaccount.click();
		Thread.sleep(2000);
		   WebElement createaccount= driver.findElement(By.xpath("(//span[@class='bttn__content'])[3]"));
		   createaccount.click();
		
	    WebElement personalaccount= driver.findElement(By.xpath("(//span[@class=\"bttn__content\"])[1]"));
	     personalaccount.click();
		
	     WebElement email= driver.findElement(By.xpath("//input[@type=\"email\"]"));
	     email.sendKeys("Nikhilpatil@gmail.com");
		
	     WebElement password= driver.findElement(By.xpath("//input[@type=\"password\"]"));
	     password.sendKeys("Nikhil@123");
		
	     WebElement show= driver.findElement(By.xpath("//label[@id=\"showPasswordCheck\"]"));
	     show.click();
		
	     WebElement zipcode= driver.findElement(By.xpath("//input[@id=\"zipCode\"]"));
	     zipcode.sendKeys("43122");
		
	     
	     

	}

}
