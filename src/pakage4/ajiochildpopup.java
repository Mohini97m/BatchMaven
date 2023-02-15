package pakage4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajiochildpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.ajio.com/");
		   Thread.sleep(3000);
		   
		   WebElement facebook= driver.findElement(By.xpath("//a[@title='Facebook']"));
		   facebook.click();
		   Thread.sleep(3000);
		   
		   WebElement pinterest= driver.findElement(By.xpath("//a[@title='Pinterest']"));
		   pinterest.click();
		   Thread.sleep(3000);
		   
		   ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(add.get(2));
		   
		   Thread.sleep(3000);
		   WebElement login= driver.findElement(By.xpath("//div[text()='Log in']"));
		   login.click();
		   Thread.sleep(3000);
		   
		   WebElement email= driver.findElement(By.xpath("//input[@autocomplete='email']"));
		   email.sendKeys("mohinimagar@gmail.com");
		   Thread.sleep(3000);
		   
		   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("986545034");
		   Thread.sleep(2000);
	       
	}

}
