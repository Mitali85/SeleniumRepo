package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentTest {
	
	WebDriver driver;
	
  @Test
  public void OpenBrowser()
  {
	  driver=new ChromeDriver();
  }
  
  @Test(dependsOnMethods = {"OpenBrowser"} )
  //@Test(priority = 1)
  public void CloseBrowser()
  {
	  driver.close();
  }
  
  
  
}
