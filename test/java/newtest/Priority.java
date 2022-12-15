package newtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Priority {
  @Test(priority =1)
  public void login() {
	  System.out.println("1234");
  }
  @Test(priority =1,groups= {"smoke"},enabled=false)
  public void addToCartlogin() {
	  System.out.println("44444");
  }
  @Test(priority =2,groups= {"Regression"})
  public void logout() {
	  System.out.println("33333");
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}
