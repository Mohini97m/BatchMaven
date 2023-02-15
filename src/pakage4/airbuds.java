package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airbuds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.flipkart.com/");
		  
		   WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		   search.sendKeys("mobile");
		   Thread.sleep(2000);
		  
		   WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		   submit.click();
		   Thread.sleep(2000);
		   
		   WebElement dynamic = driver.findElement(By.xpath("(//div[@id='container']//div)[201]"));
		   dynamic.click();
		   Thread.sleep(2000);
		   
		   WebElement price = driver.findElement(By.xpath("(//div[@class='_30jeq3'])[1]"));
		   
		   String div = price.getText();
		   System.out.println(div);
		   
		   
		   
		   
		   
	}

}
