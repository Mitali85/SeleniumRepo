package MouseKeyboardMoments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		//impliciteWait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        //login process
      //to locate username textbox
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
        //to locate password textbox
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        
        //to locate login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        
        //import Actions class---Selenium interaction package
        Actions act=new Actions(driver);
        
        //to be locate all webelements----all module
        List<WebElement> module=driver.findElements(By.className("oxd-main-menu-item-wrapper"));
        System.out.println(module.size());
        
       // for(int i=0;i<module.size();i++)
        //{
        	//act.moveToElement(module.get(i)).build().perform();
        	//System.out.println(module.get(i).getText());
        //}
        
        for(WebElement ele: module)
        {
        	act.moveToElement(ele).build().perform();
        	System.out.println(ele.getText());
        }
        
        
        

	}

}
