//conditional synchronization----impliciteWait
package Syncronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		
		 //impliciteWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     //or
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	     driver.manage().window().maximize();
	      
	      //login process
	      //to locate user name textbox
	      driver.findElement(By.className("oxd-input")).sendKeys("Admin");
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      //logout process
	      //to locate image for logout option
	      driver.findElement(By.className("oxd-userdropdown-img")).click();
	      
	      //to locate logout option
	      driver.findElement(By.linkText("Logout")).click();
	      
	      

	}

}
