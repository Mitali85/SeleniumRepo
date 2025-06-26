package HandlingWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
			
	 	driver.get("https://demo.automationtesting.in/Frames.html");
	 	
	 	//to locate Iframe with in an Iframe link
	 	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	 	
	 	//to switch on frame
	 	//way 1----by index
	 	driver.switchTo().frame(0);
	 	
	 	//inner frame heading
	 	String heading1=driver.findElement(By.xpath("/html/body/section/div/h5")).getText();
	 	System.out.println("inner frame heading is----"+heading1);
	 	
	 	//to switch back
	 	//driver.switchTo().parentFrame();
	 	driver.switchTo().defaultContent();
	 	
	 	//to switch on outer frame
	 	//way 1---by index
	 	//driver.switchTo().frame(1);

	    WebElement ele=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	    
	    //way 2---by webelement
	    driver.switchTo().frame(ele);
	    
	    //outer frame heading 
	    String heading2=driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
	    System.out.println("outer frame heading is-----"+heading2);
	    
	    
	 	
	 	



	}

}
