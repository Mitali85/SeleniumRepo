package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrangeAnnotation 
{
	WebDriver driver;
  @Test
  public void addskill() throws Exception
  {
	//to locate add skills button
      driver.findElement(By.className("oxd-button--secondary")).click();
   
      Thread.sleep(5000);
      //locate name textbox
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("New skill");
      
      Thread.sleep(5000);
      //locate click on save button
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
      

  }
  @BeforeMethod
  public void beforeMethod() throws Exception
  {
	  Thread.sleep(5000);
	  boolean res=driver.findElement(By.className("oxd-button--secondary")).isDisplayed();
	  if(res)
	  {
		  System.out.println("Add button visible");
	  }
	  else
	  {
		 System.out.println("Add button is not visible"); 
	  }
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.navigate().back();
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("All test run");
	  
  }

  @BeforeTest
  public void beforeTest() 
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
      driver.findElement(By.className("oxd-input")).sendKeys("Admin");
   
      driver.findElement(By.name("password")).sendKeys("admin123");
      
      driver.findElement(By.className("oxd-button")).click();
      
  }

  @AfterTest
  public void afterTest() 
  {
	
      driver.findElement(By.className("oxd-userdropdown-img")).click();
     
      driver.findElement(By.linkText("Logout")).click();
      

  }

  @BeforeSuite
  public void beforeSuite() 
  {
	 driver=new ChromeDriver(); 
	//impliciteWait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	 
	 driver.manage().window().maximize();
      

  }

  @AfterSuite
  public void afterSuite() 
  {
	  driver.close();
  }

}
