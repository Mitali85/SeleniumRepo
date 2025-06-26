package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.name("firstname")).sendKeys("Mitali");
		
		driver.findElement(By.name("lastname")).sendKeys("Patil");

		driver.findElement(By.name("email")).sendKeys("dre@767");

		driver.findElement(By.name("telephone")).sendKeys("54678");
		
		driver.findElement(By.name("password")).sendKeys("mona456");
		
		driver.findElement(By.name("confirm")).sendKeys("mona456");


	}

}
