package HandlingWebelement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.co.in/");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        Thread.sleep(5000);
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Automation Testing\\Automation\\OrangeHRM.jpg"));
		
		


	}

}
