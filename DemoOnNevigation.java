package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoOnNevigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch browser
        WebDriver driver=new EdgeDriver();
		
        //to launch website
		driver.get("https://www.google.co.in/");
		
		//to maximize window size
		driver.manage().window().maximize();	
		
		//navigate on image page
		driver.navigate().to("https://www.google.co.in/imghp?hl=en&ogbl");
		
		Thread.sleep(5000);
		//to back on google page
		driver.navigate().back();
		
		Thread.sleep(5000);
		//to forward on image page
		driver.navigate().forward();
		
		Thread.sleep(5000);
		//to reload/refresh page
		driver.navigate().refresh();
		
		

	}

}
