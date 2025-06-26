package HandlingWebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to locate Alert with OK and cancel link
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		
		//to locate click button
		driver.findElement(By.className("btn-primary")).click();
				
	    //to switch on alert
	    Alert a=driver.switchTo().alert();
				
	    System.out.println(a.getText());
				
		//a.accept();   //to handle alert-----OK
		a.dismiss();  //to cancel




	}

}
