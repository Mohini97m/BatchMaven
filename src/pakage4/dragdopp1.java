package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdopp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://jqueryui.com/droppable/");
		   Thread.sleep(3000);
		   
	//	   driver.manage().window().minimize();
		   
		   WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		  
		   WebElement droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		  
		   Actions act = new Actions(driver);
		   
		   act.dragAndDrop(draggable, droppable).perform();
		   
		   act.moveToElement(draggable).clickAndHold().moveToElement(droppable).release().build().perform();
		   
          System.out.println("==========");		   

	
	}

}
