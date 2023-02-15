package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.tutorialrepublic.com/html-tutorial/html-iframes.php");
		   Thread.sleep(3000);
		   
		   WebElement iframe= driver.findElement(By.xpath("//iframe[@title='Blank']"));
		  
		   driver.switchTo().frame(iframe);
		   Thread.sleep(3000);
		   
		   WebElement iframe1= driver.findElement(By.xpath("//iframe[@id='aswift_1']"));
			  
		   driver.switchTo().frame(iframe1);
		   Thread.sleep(3000);
		   
		   driver.switchTo().parentFrame();

	}

}
