package HandlingWebelement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Automation Testing\\Automation\\ScreenShot.jpg"));
		
		//boolean res=driver.getPageSource().contains("Automotive essentials |");
		//if(res)
		//{
			//System.out.println("Teat passed");
		//}
		//else
		//{
			//System.out.println("Teat failed");
		//}
		
		
		
		
		
		
		



	}

}
