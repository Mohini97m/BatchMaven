package pakage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Seleninum1 {

			public static void main(String[] args) throws InterruptedException {
				
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   
			   WebDriver driver = new ChromeDriver();
			   
			   driver.get("https://www.facebook.com/");
			   
			   Thread.sleep(3000);
			   
			   driver.get("https://www.flipkart.com/");
			   
              driver.get("https://www.instagram.com/");
			   
			   Thread.sleep(3000);
			  driver.close();
			 
			  driver.quit();
			  driver.navigate().to("https://www.selenium.dev/downloads/");
		 String url =  driver.getCurrentUrl();
	   	 System.out.println(url);
		
	   	 String title = driver.getTitle();
	   	 System.out.println(title);
         		
			}

}
 