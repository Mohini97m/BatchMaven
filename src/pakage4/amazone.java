package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.amazon.in/");
		  
		   WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		   search.sendKeys("makeup kit");
		   Thread.sleep(2000);

		   WebElement submit = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		   submit.click();
		   Thread.sleep(2000);
		  
		   WebElement dynamic = driver.findElement(By.xpath("(//div[@id='a-page']//img)[4]"));
		   dynamic.click();
		   Thread.sleep(2000);
		  
		   WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

		   String div = price.getText();
		   System.out.println(div);
	}

}
