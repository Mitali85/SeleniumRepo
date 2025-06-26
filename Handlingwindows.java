package HandlingWebelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
	 	driver.get("https://demo.automationtesting.in/Windows.html");
	 	
	 	//to locate open new separate window link
	 	driver.findElement(By.linkText("Open New Seperate Windows")).click();
	 	
	 	//to locate click button
	 	driver.findElement(By.className("btn-primary")).click();
	 	
	 	//to handle multiple tabs or windows
	    Set<String> handles=driver.getWindowHandles();
	    
	    for(String h:handles)
	    {
	    	System.out.println(driver.switchTo().window(h).getTitle());
	    	//driver.switchTo().window(h).close();
	    	driver.switchTo().window(h).manage().window().maximize();
	    }
	    driver.quit();
	    
	}

}
