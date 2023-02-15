package pakage4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://demoqa.com/alerts");
		   Thread.sleep(2000);
		   
		   WebElement click1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		   click1.click();
		   
		   Thread.sleep(2000);
		   driver.switchTo().alert().accept();
		   
		   Thread.sleep(2000);
		   
		   WebElement click2 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		   click2.click();
		   Thread.sleep(2000);
		   Alert alt = driver.switchTo().alert();
		   String text= alt.getText();
		   System.out.println(text);
		   Thread.sleep(2000);
			 
		  WebElement cli3 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		   cli3.click();
		  Thread.sleep(2000);
		   
		   driver.switchTo().alert().accept();
		   Thread.sleep(2000);
		   
		 //  WebElement click4 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		  // click4.click();
		   
		  // Thread.sleep(2000);
		  // driver.switchTo().alert().dismiss();
		   
		//   WebElement click5 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		 //  click5.click();
		   
		  // Thread.sleep(2000);
		 //  Alert alt1 = driver.switchTo().alert();
		   
		 //  alt.sendKeys("Mohini");
		//   driver.switchTo().alert().accept();
	}

}
