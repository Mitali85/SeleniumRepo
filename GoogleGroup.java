package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleGroup {
	WebDriver driver;
	
  @Test(groups = {"Top"})
  public void gmail() 
  {
	  driver.findElement(By.linkText("Gmail")).click();;
  }
  @Test(groups = {"Top"})
  public void img() 
  {
	  driver.findElement(By.linkText("Images")).click();;
  }
  @Test(groups = {"Top"})
  public void about() 
  {
	  driver.findElement(By.linkText("About")).click();;
  }
  @Test(groups = {"Bottom"})
  public void adv() 
  {
	  driver.findElement(By.linkText("Advertising")).click();;
  }
  @Test(groups = {"Bottom"})
  public void business() 
  {
	  driver.findElement(By.linkText("Business")).click();;
  }
   @BeforeMethod(alwaysRun = true)
  public void beforeMethod() 
  {
	  System.out.println(driver.getTitle());  
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() 
  {
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
  }

  @BeforeTest(alwaysRun = true)
  public void openBrowser() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
  }

  @AfterTest(alwaysRun = true)
  public void closeBrowser() 
  {
	  driver.close();
  }

}
