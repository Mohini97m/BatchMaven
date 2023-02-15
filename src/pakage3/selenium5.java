package pakage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://facebook.com/");
		   
		   
     	  WebElement createacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  createacc.click();
		  
		  Thread.sleep(2000);
		  WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		  String value = firstname.getAttribute("aria-label");
		  System.out.println(value);
		  Thread.sleep(2000);
		  //createacc.click();
		  
		  WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		  Select s = new Select(date);
		  s.selectByIndex(3);
		  
		  Thread.sleep(2000);
		  
		  WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		  Select s1 = new Select(month);
		  s1.selectByValue("3");
		  Thread.sleep(2000);
		  
		  WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		  Select s2 = new Select(year);
		  s2.selectByVisibleText("2018");
		  
		  WebElement female = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  Thread.sleep(2000);
		  boolean result = female.isSelected();
		  if(result==true)
		  {
			  System.out.println("element is selected");
		  }
		  else
		  {
			  System.out.println("element is not selected");
		  }
		  System.out.println(result);
          result = female.isSelected();
          Thread.sleep(2000);
		  WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		  
          boolean result1 = male.isDisplayed();
		  if(result1==true)
		  {
			  System.out.println("element is selected");
		  }
		  else
		  {
			  System.out.println("element is not selected");
		  }
		  System.out.println(result1);
          result = male.isDisplayed();
          Thread.sleep(2000);
          
         WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
         custom.click();
         Thread.sleep(2000);
          boolean result3 = custom.isSelected();
		  if(result3==true)
		  {
			  System.out.println("element is selected");
		  }
		  else
		  {
			  System.out.println("element is not selected");
		  }
		  System.out.println(result1);
          result = custom.isEnabled();
          Thread.sleep(2000);
          WebElement pronun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
          Select x = new Select(pronun);
          x.selectByIndex(3);
	}

}
