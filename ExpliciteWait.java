//conditional synchronization----ExpliciteWait
package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	      driver.manage().window().maximize();
	      
	      
	      //login process
	      //ExpliciteWait
	      WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	      w1.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	      
	      //to locate user name textbox
	      driver.findElement(By.className("oxd-input")).sendKeys("Admin");
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      //logout process
	      //ExpliciteWait
	      WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
	      w2.until(ExpectedConditions.presenceOfElementLocated(By.className("oxd-userdropdown-img")));
	     
	      //to locate image for logout option
	      driver.findElement(By.className("oxd-userdropdown-img")).click();
	      
	      //ExpliciateWait
	      WebDriverWait w3=new WebDriverWait(driver,Duration.ofSeconds(10));
	      w3.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
	      

	      //to locate logout option
	      driver.findElement(By.linkText("Logout")).click();
	      


	}

}
