package pakage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		  
		   driver.get("https://phptravels.org/");
		   Thread.sleep(2000);
		   
		   WebElement button = driver.findElement(By.xpath("//a[text()='Create account']"));
		   button.click();
		   Thread.sleep(2000);
		
		   WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("Mohini");
		   Thread.sleep(2000);
		   
		   WebElement lastname = driver.findElement(By.name("lastname"));
		   lastname.sendKeys("Magar");
		   Thread.sleep(2000); 
		   
		   WebElement email = driver.findElement(By.id("inputEmail"));
		   email.sendKeys("mohinimagar97@gmail.com");
		   Thread.sleep(2000);
		   
		   WebElement arrow = driver.findElement(By.xpath("//div[@class=\"iti-arrow\"]"));
		   arrow.click();
		   Thread.sleep(2000);
		   
		   WebElement countrylist = driver.findElement(By.xpath("(//span[@class=\"country-name\"])[101]"));
		   countrylist.click();
		   Thread.sleep(2000);
		   
		   WebElement mobileno = driver.findElement(By.xpath("//input[@name=\"phonenumber\"]"));
		   mobileno.sendKeys("9730674635");
		   Thread.sleep(2000);
		   
		   WebElement companyname = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		   companyname.sendKeys("XYZ");
		   Thread.sleep(2000);
		   
		   WebElement address = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
		   address.sendKeys("Gokulwadi,aurangpura,Aurangabad");
		   Thread.sleep(2000);
		   
		   WebElement address2 = driver.findElement(By.xpath("//input[@name=\"address2\"]"));
		   address2.sendKeys("Gokulwadi,aurangpura,Aurangabad");
		   Thread.sleep(2000);
		   
		   WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
		   city.sendKeys("Aurangpura");
		   Thread.sleep(2000);
		   
		   WebElement state = driver.findElement(By.xpath("//input[@name=\"state\"]"));
		   state.sendKeys("Maharashtra");
		   Thread.sleep(2000);
		   
		   WebElement postcode = driver.findElement(By.xpath("//input[@name=\"postcode\"]"));
		   postcode.sendKeys("431001");
		   Thread.sleep(2000);
		   
		   WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		   country.sendKeys("India");
		   Thread.sleep(2000);
		   
		   WebElement whatsapp = driver.findElement(By.xpath("(//input[@type=\"text\"])[11]"));
		   whatsapp.sendKeys("8875390234");
		   Thread.sleep(2000);
		   
		   WebElement password = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		   password.sendKeys("Mohini@123");
		   Thread.sleep(2000);
		   
		   WebElement conformPassword = driver.findElement(By.xpath("//input[@name=\"password2\"]"));
		   conformPassword.sendKeys("Mohini@123");
		   Thread.sleep(2000);
		   
		  WebElement register = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		  register.click();
		   
		   
		  
	}

}
