package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoOnEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");

	}

}
