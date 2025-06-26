package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	
	WebDriver driver;
	
  @Test@Parameters({"browsers"})
  public void launchbrowser(String browser)
  
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else
	  {
		  driver=new EdgeDriver();
	  }
	  driver.get("https://www.google.co.in/");
	  
  }
}
