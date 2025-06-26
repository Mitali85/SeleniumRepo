//Unconditional synchronization----Thread.sleep()
package Syncronization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	      driver.manage().window().maximize();
	      
	      Thread.sleep(5000);
	      //login process
	      //to locate user name textbox
	      driver.findElement(By.className("oxd-input")).sendKeys("Admin");
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      Thread.sleep(5000);
	      //logout process
	      //to locate image for logout option
	      driver.findElement(By.className("oxd-userdropdown-img")).click();
	      
	      Thread.sleep(5000);
	      //to locate logout option
	      driver.findElement(By.linkText("Logout")).click();
	      
	      
	        

		

	}

}
