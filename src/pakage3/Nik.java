package pakage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nik {

	
		public static void main(String[] args) throws InterruptedException {
			
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   
			   WebDriver driver = new ChromeDriver();
			   
			   driver.get("https://www.instagram.com/");
			   
			   Thread.sleep(3000);
			   
			   driver.get("https://www.amazon.fr/");
			   
			   driver.navigate().back();
			   
			   driver.get("https://paytm.com/");
			   
			   driver.navigate().back();
			   Thread.sleep(2000);//delay 3sec -->3000ms
			   driver.close();
			   
			 //  Thread.sleep(3000);
			//   driver.navigate().refresh();
			 //  Thread.sleep(3000);
			  // driver.navigate().forward();
			   
			   
		//	   driver.manage().window().back();
		

	}

		

		
}
