package pakage3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	
			public static void main(String[] args) throws InterruptedException {
				
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   
			   WebDriver driver = new ChromeDriver();
			   
			   driver.get("https://www.facebook.com/");
			   
			 
	           //change the size of the browser 
			   Dimension d = new Dimension(400, 300);
			   driver.manage().window().setSize(d);
			  
			   Thread.sleep(3000);
			     //change the position of the browser 
			   Point p = new Point(-3,5);
			   driver.manage().window().setPosition(p);
			   
			   Thread.sleep(3000);
			   Point x = new Point(3,580);
			   driver.manage().window().setPosition(x);
			   
			   Thread.sleep(3000);
			   Point y = new Point(1020,5);
			   driver.manage().window().setPosition(y);
			   
			   Thread.sleep(3000);
			   Point z= new Point(1020,520);
			   driver.manage().window().setPosition(z);		
			
			}

}
