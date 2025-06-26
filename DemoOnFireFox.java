package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoOnFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new FirefoxDriver();
        
	    driver.get("https://www.google.co.in/");


	}

}
