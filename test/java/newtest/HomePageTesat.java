package newtest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomePageTesat {
	WebDriver driver;
  @Test
  public void signIn() {
	  driver.findElement(By.linkText("Sign Up")).click();
	 

  }
 @Test(priority=2)

  public void billingDetails() {
	  driver.findElement(By.id("inputCompanyName")).sendKeys("Capgemini");
	   driver.findElement(By.name("city")).sendKeys("Banglore");
	  
	  
	  
  }  
  @Test(priority=1)
  public void signDetails () {
	  driver.findElement(By.cssSelector("#inputFirstName")).sendKeys("Nandini");
		 
	  driver.findElement(By.cssSelector("#inputPhone")).sendKeys("4785389053");
  }
 	
  

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  driver.get("https://phptravels.com/");
  }

  @AfterClass
  public void afterClass() {
  }

}
