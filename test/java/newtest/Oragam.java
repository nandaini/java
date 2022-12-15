package newtest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Oragam {
	WebDriver driver;
  @Test(priority=1)
  public void f() {
	  WebElement name =driver.findElement(By.id("Form_getForm_FullName"));
	  name.sendKeys("nandini");
	  WebElement phone= driver.findElement(By.cssSelector("input#Form_getForm_Contact"));
	  phone.sendKeys("93749576295");
  }
 @Test(priority=2)
 public void f1() {
	 WebElement mail =driver.findElement(By.id("Form_getForm_Email"));
	  mail.sendKeys("nandame379@gmail.com");
	  
	 
 }
 @Test(priority=4)
 public void f3() {
	 WebElement phone= driver.findElement(By.cssSelector("input#Form_getForm_Contact"));
	  phone.sendKeys("93749576295");
 }
	 
 @Test(priority=3)
 public void f2() {
	 WebElement select= driver.findElement(By.cssSelector("select#Form_getForm_Country"));
	 Select dropdownEmp =new Select(select);
	 dropdownEmp .selectByIndex(2);
	 
	 
 }
	 
 
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
  WebDriverManager.chromedriver().setup();
  
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
  }
  @AfterClass
  public void afterClass() {
	 
  }
 

}
