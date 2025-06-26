package Syncronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTiming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver=new ChromeDriver();
		
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	      driver.manage().window().maximize();
	      
	      long time=System.currentTimeMillis();
	      
	      System.out.println("Page load time is-----"+time);
	      


	}

}
