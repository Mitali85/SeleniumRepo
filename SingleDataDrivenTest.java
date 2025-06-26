package DataDrivenFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleDataDrivenTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		 //impliciteWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	     driver.manage().window().maximize();
	     
	     //to read data from a file
	     File f=new File("C:\\Automation Testing\\Automation\\LoginData.csv");
	     FileReader fr=new FileReader(f);
	     BufferedReader br=new BufferedReader(fr);
	     String line=br.readLine();  // data read from bufferedreader //data in the form of string that why we can write string line readline methods string value refer keta hai
	     
	     String data[]=line.split(",");  //split method array ko seprate krta hai
	      
	      //login process
	      //to locate user name textbox
	      driver.findElement(By.className("oxd-input")).sendKeys(data[0]);
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys(data[1]);
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      //logout process
	      //to locate image for logout option
	      driver.findElement(By.className("oxd-userdropdown-img")).click();
	      
	      //to locate logout option
	      driver.findElement(By.linkText("Logout")).click();
	      

	}

}
