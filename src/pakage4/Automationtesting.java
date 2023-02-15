package pakage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationtesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		   Thread.sleep(2000);
		   
		   WebElement lastname = driver.findElement(By.xpath("//input[@name='Last_Name']"));
		   lastname.sendKeys("Patil");
		   Thread.sleep(2000);
		   
		   WebElement date = driver.findElement(By.xpath("//select[@id='Birthday_Day']"));
		   Select result = new Select(date);
		   result.selectByValue("30");
		   Thread.sleep(2000);
		   
		   WebElement month = driver.findElement(By.xpath("//select[@id='Birthday_Month']"));
		   Select result1 = new Select(month);
		   result1.selectByVisibleText("Feb");
		   Thread.sleep(2000);
		   
		   WebElement year = driver.findElement(By.xpath("//select[@name='Birthday_Year']"));
		   Select result2 = new Select(year);
		   result2.selectByVisibleText("2011");
		   Thread.sleep(2000);
		   
		   WebElement email= driver.findElement(By.xpath("//input[@name='Email_Id']"));
		   email.sendKeys("nikhilpatil@123gmail.com");
		   Thread.sleep(2000);
		   
		   WebElement mobileno= driver.findElement(By.xpath("//input[@name='Mobile_Number']"));
		   mobileno.sendKeys("9876673323");
		   Thread.sleep(2000);
		   
		   WebElement male= driver.findElement(By.xpath("(//input[@name='Gender'])[1]"));
		   
		   boolean result3 = male.isSelected();
		   if(result3==true)
		   {
			   System.out.println("Element is selected");
		   }
		   else
		   {
			   System.out.println("Element is not selected");
		   }
		   result3 = male.isSelected();
		   male.click();
		  Thread.sleep(2000);
		   
		    WebElement female= driver.findElement(By.xpath("(//input[@name='Gender'])[2]"));
		   boolean  result4 = female.isDisplayed();
			   if(result4==true)
			   {
				   System.out.println("Element is selected");
			   }
			   else
			   {
				   System.out.println("Element is not selected");
			   }
			   result3 = male.isSelected();
			   female.click();
		 Thread.sleep(2000);
		 
	     WebElement address= driver.findElement(By.xpath("//textarea[@name='Address']"));  
	      address.sendKeys("Aurangpura");
	      Thread.sleep(2000);
	      address.clear();
	      Thread.sleep(2000);
			 
	      WebElement city= driver.findElement(By.xpath("//input[@name='City']"));  
	      city.sendKeys("Aurangabad");
          Thread.sleep(2000);
          
	      WebElement pincode= driver.findElement(By.xpath("//input[@name='Pin_Code']"));  
	      pincode.sendKeys("33345");
	      Thread.sleep(2000);
	      
	      WebElement state= driver.findElement(By.xpath("//input[@name='State']"));  
	      state.sendKeys("Maharashtra");
          Thread.sleep(2000);
	      
          WebElement country= driver.findElement(By.xpath("//input[@name='Country']"));  
	      country.sendKeys("India");
          Thread.sleep(2000);
	
         WebElement drawing= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")); 
         drawing.click();
         boolean  result5 = drawing.isDisplayed();
		   if(result5==true)
		   {
			   
			   System.out.println("Element is selected");
			  
		   }
		   else
		   {
			   System.out.println("Element is not selected");
		   }
		   result4 = drawing.isSelected();
		   Thread.sleep(2000);

		   drawing.click();
	       Thread.sleep(2000);
	       
          WebElement singing= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));  
 	      singing.click();
          Thread.sleep(2000);
          
          WebElement dancing= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));  
 	      dancing.click();
          Thread.sleep(2000);
          
          WebElement Sketching= driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));  
          Sketching.click();
          Thread.sleep(2000);
          
          WebElement others= driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));  
          others.click();
          Thread.sleep(2000);
          others.click();
          Thread.sleep(2000);

          WebElement classXBoard= driver.findElement(By.xpath("//input[@name='ClassX_Board']"));  
          classXBoard.sendKeys("SSC");
          Thread.sleep(2000);
          
          WebElement classXPersentage= driver.findElement(By.xpath("//input[@name='ClassX_Percentage']"));  
          classXPersentage.sendKeys("70%");
          Thread.sleep(2000);
          
          WebElement classXYear= driver.findElement(By.xpath("//input[@name='ClassX_YrOfPassing']"));  
          classXYear.sendKeys("2012");
          Thread.sleep(2000);
          
          WebElement classXIIBoard= driver.findElement(By.xpath("//input[@name='ClassXII_Board']"));  
          classXIIBoard.sendKeys("HSC");
          Thread.sleep(2000);
          
          WebElement classXIIPercentage= driver.findElement(By.xpath("//input[@name='ClassXII_Percentage']"));  
          classXIIPercentage.sendKeys("75%");
          Thread.sleep(2000);
          
          WebElement classXIIYear= driver.findElement(By.xpath("//input[@name='ClassXII_YrOfPassing']"));  
          classXIIYear.sendKeys("2013");
          Thread.sleep(2000);

          WebElement gratuationBoard= driver.findElement(By.xpath("//input[@name='Graduation_Board']"));  
          gratuationBoard.sendKeys("Btech");
          Thread.sleep(2000);

          WebElement gratuationPercentage= driver.findElement(By.xpath("//input[@name='Graduation_Percentage']"));  
          gratuationPercentage.sendKeys("80%");
          Thread.sleep(2000);

          WebElement gratuationYear= driver.findElement(By.xpath("//input[@name='Graduation_YrOfPassing']"));  
          gratuationYear.sendKeys("2020");
          Thread.sleep(2000);

          WebElement masterBoard= driver.findElement(By.xpath("//input[@name='Masters_Board']"));  
          masterBoard.sendKeys("Mtech");
          Thread.sleep(2000);

          WebElement masterPercentage= driver.findElement(By.xpath("//input[@name='Masters_Percentage']"));  
          masterPercentage.sendKeys("85%");
          Thread.sleep(2000);

          WebElement masterYear= driver.findElement(By.xpath("//input[@name='Masters_YrOfPassing']"));  
          masterYear.sendKeys("2022");
          Thread.sleep(2000);

          WebElement BCA= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));  
          BCA.click();
          Thread.sleep(2000);
          BCA.click();
          Thread.sleep(2000);
          
          WebElement BCom= driver.findElement(By.xpath("(//input[@type='radio'])[4]"));  
          BCom.click();
          Thread.sleep(2000);

          WebElement Bsc= driver.findElement(By.xpath("(//input[@type='radio'])[5]"));  
          Bsc.click();
          Thread.sleep(2000);
          Bsc.click();
          Thread.sleep(2000);

          WebElement BA= driver.findElement(By.xpath("(//input[@type='radio'])[6]"));  
          BA.click();
          Thread.sleep(2000);
          BA.click();
          Thread.sleep(2000);
          
          WebElement submit= driver.findElement(By.xpath("(//input[@type='submit'])[1]"));  
          submit.click();
	}

}
