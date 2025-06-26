package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//to locate legend tag --by tagName
		String tagvalue=driver.findElement(By.tagName("legend")).getText();
		System.out.println(tagvalue);
		
		//to locate continue button--by className
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(5000);
		//to locate login link--by--linkText
		driver.findElement(By.linkText("Login")).click();
	
	    //to locate login link---by---partiallinkText
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Forgotten Pass")).click();
		
		
	}

}
 