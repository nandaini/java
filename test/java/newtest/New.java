package newtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	WebDriver driver;
	 @Test
	 public void url() { 
	 	  driver.get("http://toolsqa.com/");
	 	  driver.manage().window().maximize();
	 	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	

  @Test
public void selinium() {
	  
	driver.findElement(By.linkText("SELENIUM TRAINING")).click();
			
  }
@BeforeClass
public void launchURL() 
{
	  WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	  
}
@AfterClass
public void closeBrowser() 
{
	driver.close(); 
}
}

