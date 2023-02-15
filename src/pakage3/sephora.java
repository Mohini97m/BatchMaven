package pakage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sephora {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.sephora.com/");
		   
		   WebElement signin= driver.findElement(By.xpath("//span[@data-at='sign_in_header']"));
		   signin.click();
		   Thread.sleep(2000);
		   
		   WebElement createacc= driver.findElement(By.xpath("(//button[text()='Create Account'])[5]"));
		   createacc.click();
		   Thread.sleep(2000);
		   
		 //  String attributevalue = email.getAttribute("css-8gauv0");
		   //System.out.println(attributevalue);
		//   firstname.click();
		   
		  // WebElement createaccount= driver.findElement(By.xpath("(//button[text()='Create Account'])[5]"));
		 //  createaccount.click();
		   
	}
}
