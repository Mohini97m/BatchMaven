package pakage4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

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
		   
		   WebElement iframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		  
		   driver.switchTo().frame(iframe);
		   
		   WebElement clickme= driver.findElement(By.xpath("//button[@type='button']"));
		   clickme.click();
		   
		   System.out.println(driver.getCurrentUrl());
		   //driver.switchTo().window(driver.getWindowHandles());
	   Thread.sleep(1000);
	     driver.switchTo().defaultContent();
	     //driver.switchTo().parentFrame();
	}

}
