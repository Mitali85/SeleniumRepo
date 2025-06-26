package HandlingWebelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
	 	driver.get("https://demo.automationtesting.in/Windows.html");
	 	
	 	//to locate click button
	 	driver.findElement(By.className("btn-info")).click();
	 	
	 	Thread.sleep(5000);
	 	//to handle multiple tabs or windows
	    Set<String> handles=driver.getWindowHandles();  //handel multiple tab
	    
	   // String handel=driver.getWindowHandle();//handel singel tab
	    
	    for(String h:handles)
	    {
	    	System.out.println(driver.switchTo().window(h).getTitle());
	    	//driver.switchTo().window(h).close();
	    }
        //driver.close();
	    driver.quit();

	}

}
