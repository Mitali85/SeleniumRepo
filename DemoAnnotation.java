package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoAnnotation {
  @Test
  public void f() 
  {
	 System.out.println("This is a default test method"); 
  }
  @Test
  public void methodnew() 
  {
	 System.out.println("This is a new method"); 
  }  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method-----executed before each test mehod get called"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method-----executed after each test mehod has been executed"); 
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class----executed before first test method from the class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class----executed after all test method from the class has executed");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test----executed before class");
  }
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After test----executed after class");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suite----executed before first test ");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suite----executed after test");
  }

}
