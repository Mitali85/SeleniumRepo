package HandlingWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			
	 	driver.get("https://demo.automationtesting.in/Register.html");
	 	
	 	//locate dropdown list
	 	WebElement dd=driver.findElement(By.id("Skills"));
	 	//way 1
	 	//dd.click();
	 	//dd.sendKeys("CSS");
	 	
	 	//way 2
	 	//locate all options  //all option list mde aahet mhun aapn list interface ghetl aahe
	 	//List<WebElement> options=driver.findElements(By.tagName("option"));
	 	
	 	//for(WebElement o: options)
	 	//{
	 		//if(o.getText().equals("CSS"))
	 		//{
	 			//o.click();
	 			//break;
	 		//}
	 	//}
	 	
	 	//way 3---using select class methods
	 	Select s=new Select(dd);  //vrti aapn dd cha reference tayar kela aahe mhun ethe aapn dd ghetl nahitr aaplyala driver.findelement hi step lihavi lagli asti
	 	//1st way----select by index method
	 	//s.selectByIndex(6);
	 	
	 	//2nd way----select by value
	 	//s.selectByValue("MySQL");
	 	
	 	//3rd way---select by visible text
	 	s.selectByVisibleText("Desktop Publishing");

	 	
		

	}

}
