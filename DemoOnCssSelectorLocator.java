package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnCssSelectorLocator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//way 1: by id attribute syntax-->tagname#id
		//to locate firstname textbox
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Mitali");
		
		//way 2:by class name syntax-->tagname.classname
		//to locate continue button
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		
		//way 3:by any attribute syntax: tagname[attribute='value']
		Thread.sleep(5000);
		//to locate privacy checkbox
		//driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//way 3(i):by any attribute starts with syntax:tagname[attribute^='chec']
		//to locate privacy checkbox
		//driver.findElement(By.cssSelector("input[type^='chec']")).click();
		
		//way 3(ii): by any attribute ends with syntax:tagname[attribute$='kbox']
		//to locate privacy checkbox
		//driver.findElement(By.cssSelector("input[type$='kbox']")).click();
		
		//way 3(iii): by any attribute contains syntax:tagname[attribute*='eckb']
        //to locate privacy checkbox
	    driver.findElement(By.cssSelector("input[type*='eckb']")).click();
		
		

	}

}
