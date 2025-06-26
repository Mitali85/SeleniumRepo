package DataDrivenFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDataDrivenTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		
		 //impliciteWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	     driver.manage().window().maximize();
	     
	     String validun="Admin";
	     String validpw="admin123";
	     
	     //to read data from a file
	     File f=new File("C:\\Automation Testing\\Automation\\Multiple.csv");
	     FileReader fr=new FileReader(f);
	     BufferedReader br=new BufferedReader(fr);
	     String line=br.readLine(); 
	     
	     while(line!=null)
	     {
	    	
	     String data[]=line.split(",");
	     System.out.println(data[0] +" " +data[1]);
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	      //login process
	      //to locate username textbox
	      driver.findElement(By.className("oxd-input")).sendKeys(data[0]);
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys(data[1]);
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      if(data[0].trim().equalsIgnoreCase(validun) && (data[1].trim().equalsIgnoreCase(validpw)))
	      {
	    	  System.out.println("logged is an admin role");
	      //logout process
	      driver.findElement(By.className("oxd-userdropdown-img")).click();
	      driver.findElement(By.linkText("Logout")).click();
	      
	     }
	      else
	    {
	    	if(data[0].equals("Mitali"))
	    	{
	    	
	    		System.out.println("logged is an emp role");
	    		//logged out process
	    		driver.findElement(By.className("oxd-userdropdown-img")).click();
	    		Thread.sleep(5000);
	  	        driver.findElement(By.linkText("Logout")).click();
	  	     }
	    	else
	    	{
	    		System.out.println("login failed---invalid user");
	    		//locate login button
	    		boolean res=driver.findElement(By.className("oxd-button")).isDisplayed();
	    		if(res)
	    		{
	    		  System.out.println("Test passed---we are login page");	
	    		}
	    		else
	    		{
	    			System.out.println("Test failes---we are not in login page");
	    		}
	    	}
	    }
	      
	      Thread.sleep(5000);
	      line=br.readLine();
	}
	     br.close();


	
}
}

