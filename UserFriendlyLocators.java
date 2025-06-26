package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UserFriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
	
		driver.get("https://automationbookstore.dev/");
		
		driver.manage().window().maximize();
		
	  //to locate book 5
	  WebElement book5=driver.findElement(RelativeLocator.with(By.tagName("li")).below(By.id("pid1")).toLeftOf(By.id("pid6")));
	  System.out.println(book5.getDomAttribute("id"));
	  
	  //to locate book 2
	  WebElement book2=driver.findElement(RelativeLocator.with(By.tagName("li")).above(By.id("pid6")).toRightOf(By.id("pid1")));
	  System.out.println(book2.getDomAttribute("id"));
	  
	  //to locate book 8
	  WebElement book8=driver.findElement(RelativeLocator.with(By.tagName("li")).near(By.id("pid4")).toRightOf(By.id("pid7")));
	  System.out.println(book8.getDomAttribute("id"));
	  
	 //driver.findElement(RelativeLocator.with(By.tagName("li")).near(By.id("pid4")).toRightOf(By.id("pid7")));


	  
		
		
		

	}

}
