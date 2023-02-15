package pakage4;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				   
				   WebDriver driver = new ChromeDriver();
				  
				   driver.get("https://www.ajio.com/");
				   Thread.sleep(2000);
				   
				   WebElement facebook= driver.findElement(By.xpath("//a[@title='Facebook']"));
				   WebElement twitter= driver.findElement(By.xpath("//a[@title='Twitter']"));
			   	   WebElement pinterest = driver.findElement(By.xpath("//a[@title='Pinterest']"));
				   
				   Thread.sleep(2000);
				   facebook.click();  //  
				   
				   Thread.sleep(3000);
				   twitter.click();   //  
				   
				   Thread.sleep(2000);
				   pinterest.click();   //  
				   
				   String mainbrowser = driver.getWindowHandle();
				   System.out.println(mainbrowser);
				   
				   Set<String> add = driver.getWindowHandles();
				   System.out.println(add);
				   
				   ArrayList<String> add1 = new ArrayList<String>(driver.getWindowHandles());
				 // driver.switchTo().window(add.get(0));
				   
				  String a1 = add1.get(0);
				  String a2 = add1.get(1);
				  String a3 = add1.get(2);
				  String a4 = add1.get(3);
				  
				  driver.switchTo().window(a1);
				  Thread.sleep(2000);
				  System.out.println( driver.getCurrentUrl());
	
		     	  driver.switchTo().window(a2);
		 		  Thread.sleep(2000);
			      System.out.println( driver.getCurrentUrl());
	
				  driver.switchTo().window(a3);
				  Thread.sleep(2000);
			      System.out.println( driver.getCurrentUrl());
			  
			     driver.switchTo().window(a4);
			     Thread.sleep(2000);
		         System.out.println( driver.getCurrentUrl());
	}

}
