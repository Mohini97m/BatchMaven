package pakage4;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				   
        WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		   
/*		 Calendar time = Calendar.getInstance();
		 
	         Date currentd = time.getTime();
	         System.out.println(currentd);
	         
	        System.out.println(time);
	         String screnshot = currentd.toString().replace(" ", "-").replace(":","-");
	         System.out.println(screnshot);
	
	TakesScreenshot t = (TakesScreenshot)driver;
	for(int i=0 ; i<5 ; i++) {
	File src = t.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files//screenshot123" + i +".jpeg");

	FileHandler.copy(src,dest);
	}*/
		  
		/*  TakesScreenshot t = (TakesScreenshot)driver;
		    
			DateTimeFormatter DTF = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
	    	LocalDateTime DT = LocalDateTime.now();
	    	File src =t.getScreenshotAs(OutputType.FILE);
	    	File des = new File("C:\\Users\\Admin\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\mohini_files//CaptuteScreen"+ DTF.format(DT)+ ".jpeg");
	    	FileHandler.copy(src, des);*/
		 
		  
		  Private void captureScreenshot(String fileName,String extension)throws IOException
		  {

		  // Take the screenshot and store as file format
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  // Open the current date and time
		  String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		  //Copy the screenshot on the desire location with different name using current date and time
		  FileUtils.copyFile(scrFile, new File("C:/shots/" + fileName+" "+timestamp+extension));
		  }
	}
}
