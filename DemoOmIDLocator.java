package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOmIDLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//to locate firstname textbox
		driver.findElement(By.id("input-firstname")).sendKeys("Mitali");
		
		//to locate lastname textbox
		driver.findElement(By.id("input-lastname")).sendKeys("Patil");

		//to locate email textbox
		driver.findElement(By.id("input-email")).sendKeys("dre@767");

		//to locate telephone textbox
		driver.findElement(By.id("input-telephone")).sendKeys("54678");
		
		//to locate password textbox
		driver.findElement(By.id("input-password")).sendKeys("mona456");
		
		//to locate confirm password textbox
		driver.findElement(By.id("input-confirm")).sendKeys("mona456");


	}

}
