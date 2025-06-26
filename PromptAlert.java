package HandlingWebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to locate Alert with Textbox
		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		//to locate click button
		driver.findElement(By.className("btn-info")).click();
		
		Thread.sleep(5000);
		//to switch on alert
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		Thread.sleep(5000);
		//to throw the value 
		a.sendKeys("Mitail");
		
		a.accept();  //to handle alert---OK
		
		
		


	}

}
