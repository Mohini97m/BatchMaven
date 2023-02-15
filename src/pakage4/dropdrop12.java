package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdrop12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.myntra.com/");
		   
		   Thread.sleep(3000);
		   
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		 //  WebElement button = driver.findElement(By.xpath("(//div[@class='_3LU4EM'])[62]"));
		   
		  // js.executeScript("arguments[0].scrollIntoView(true);",button);
		   
		 js.executeScript("window.scrollby(0,500)"); ///scroll down
		  
		//   js.executeScript("window.scrollby(0,-2000)"); ///scroll up
		   

	}

}
