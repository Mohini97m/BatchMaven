package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.zoho.com/salesiq/live-chat-software.html?network=g&device=c&keyword=online%20chat%20box%20for%20website&campaignid=13974448020&adgroup=124577013306&matchtype=p&placement=&creative=642165704764&adposition=&gclid=CjwKCAiA76-dBhByEiwAA0_s9eEeS9rplvOfgBQCiraOYF8MvUDv5L9l6IYBuxaURhX25NAFB2FR6RoC2DAQAvD_BwE");
		   Thread.sleep(3000);
		   
		   WebElement chat= driver.findElement(By.xpath("//em[@id='zsiq_agtpic']"));
		   chat.click();
		   Thread.sleep(3000);
		   
		   WebElement iframe= driver.findElement(By.xpath("//iframe[@id='siqiframe']"));
		  
		   driver.switchTo().frame(iframe);
		   Thread.sleep(3000);

		   WebElement chatnow= driver.findElement(By.xpath("//div[@class='chat_btn sqico-chat']"));
		   chatnow.click();
		   Thread.sleep(3000);
		   
		   WebElement text= driver.findElement(By.xpath("//textarea[@purpose='question']"));
		   text.sendKeys("dhsjadg");
		  Thread.sleep(3000); 
	
	   //    driver.switchTo().parentFrame();

	       driver.switchTo().defaultContent();
	       
	}
	

}
