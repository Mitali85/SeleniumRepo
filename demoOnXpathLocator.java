 package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoOnXpathLocator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		Thread.sleep(5000);
		//to locate radio button---yes option--Absolute xpath
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input")).click();
		
		
		Thread.sleep(5000);
		//to locate radio button---no option--Relative xpath--dom copy
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).click();
		
		Thread.sleep(5000);		
		//to locate privacy checkbox---Relative xpath--Manually
		//Syntax://tagname[@attribute='value']
	    driver.findElement(By.xpath("//input[@name='agree']")).click();
						


		
 		


	}

}
