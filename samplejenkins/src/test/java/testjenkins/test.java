package testjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	public static WebDriver driver;
	
	 
	 
	 @Test
	 public void tittle()
	 {
		 
		 System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");

		 
		 driver = new ChromeDriver();
		 driver.get("http://google.com");
		 
		 String a = driver.getTitle();
		 String b = "Google";
		 Assert.assertEquals(a, b);
		 
	 }
	 
	 @AfterTest
	 public void teardown()
	 {
		 driver.quit();
	 }
	 
     
	
}
