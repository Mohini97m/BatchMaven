package pakage4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childw3school {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.w3schools.com/js/DEFAULT.asp");
		   Thread.sleep(3000);
		   
		   WebElement target= driver.findElement(By.xpath("(//a[@target='_blank'])[57]"));
		   target.click();
		   Thread.sleep(3000);
		   
		   ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(add.get(1));
		   
		   Thread.sleep(2000);
		   
		   WebElement getwebsitebtn= driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		   getwebsitebtn.click();
		   Thread.sleep(3000);
		   
		    add = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(add.get(2));
		   
		   Thread.sleep(3000);
		   System.out.println(driver.getCurrentUrl());
	
	
	}

}
