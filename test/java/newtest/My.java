package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement search=   driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone"+Keys.ENTER);
	}
	@BeforeClass
	public void launchURL() 
	{
		  WebDriverManager.chromedriver().setup();
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  
	}
	@AfterClass
	public void closeBrowser() 
	{
		driver.close(); 
  }
}
