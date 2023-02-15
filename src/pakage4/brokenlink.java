package pakage4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.misc.FileSystemOption;

public class brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");

	       
	//      
	     List<WebElement> date = driver.findElements(By.tagName("a"));
	       int sizeb = date.size();
	       System.out.println(sizeb);
	        
	    
	        for(int i=0;i<date.size();i++)
	 	        {
	      
	 	            WebElement a= date.get(i);
	 	            String atrr = a.getAttribute("href");
	 	            System.out.println(a.getText());
	 	            String c= a.getText();
	 	            System.out.println(c);
	 	        }
	        String atrr = "";
	        if(atrr.equals("") || atrr.equals(null) )
	        {
	        	System.out.println("broken");
	        }
	        else
	        {
	        	System.out.println("not broken");
	        }
	}

}
