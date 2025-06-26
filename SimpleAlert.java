package HandlingWebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(5000);
		driver.findElement(By.className("btn btn-danger")).click();
		
		Alert a=driver.switchTo().alert();
		
		a.accept();
		
		
	}

}
