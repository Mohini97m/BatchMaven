package pakage4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrefbrokenvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");

	        //Storing the links in a list and traversing through the links
	        List<WebElement> b = driver.findElements(By.tagName("a"));

	        int sizeb = b.size();
	        System.out.println(sizeb); 
	        for(int i=0;i<sizeb;i++)
	 	        {
	 	            WebElement a= b.get(i);
	 	            String c= a.getText();
	 	            System.out.println(c);
	 	        }
	        String sizeb1 = "";
	        if(sizeb1.equals("") || sizeb1.equals(null) )
	        {
	        	System.out.println("broken");
	        }
	        else
	        {
	        	System.out.println("not broken");
	        }
	        
	        
	        
	        
	       // for(int i=0;i<sizeb;i++)
	       // {
	       //     WebElement a= b.get(i);
	       //     String c= a.getText();
	        //    System.out.println(c);
	        //}	 
	       
	}

}
