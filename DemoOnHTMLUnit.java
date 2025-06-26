package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DemoOnHTMLUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new HtmlUnitDriver();
		
		System.out.println("browser launch....");
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());  //method
		
		System.out.println(driver.getCurrentUrl()); //method
		
		System.out.println(driver.getClass());  //method
		
		boolean res=driver.getPageSource().contains("Google offered in:");  //to check this text visiable to that page
		if(res)
			System.out.println("Test passed..");
		else
			System.out.println("Test failed");
		driver.close();  //method
		System.out.println(driver.getTitle());
	}

}
