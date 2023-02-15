package pakage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleninum {

	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	    driver.manage().window().maximize();
	    
	    driver.manage().window().minimize();
	   
	   Thread.sleep(3000);//delay 3sec= 3000ms
	   
	   driver.navigate().to("https://www.selenium.dev/downloads/");
	   Thread.sleep(3000);//delay 3sec= 3000ms
	   
	   driver.navigate().back();
	   Thread.sleep(3000);//delay 3sec= 3000ms
	   
	   driver.navigate().forward();
	   Thread.sleep(3000);//delay 3sec= 3000ms
	   
	   driver.navigate().refresh();
	   
	}
	   
       }

	

