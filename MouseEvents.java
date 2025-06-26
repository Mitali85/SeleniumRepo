package MouseKeyboardMoments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//implicitewait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(5000);
        driver.manage().window().maximize();
        
        //login process
      //to locate username textbox
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
        //to locate password textbox
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        
        //to locate login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        
        //to locate admin modul
         WebElement ele=driver.findElement(By.linkText("Admin"));  //way 1
        //driver.findElement(By.linkText("Admin"));   //way 2
        
        Actions act=new Actions(driver); //below all method is actions class methods so that why we can create actions class object
        
        //mouse hover a single element
          act.moveToElement(ele).build().perform();  //way 1
       // act.moveToElement(driver.findElement(By.linkText("Admin")).build().perform()); //way 2
        
        //to locate PIM modul
        WebElement ele1=driver.findElement(By.linkText("PIM"));
        
        Thread.sleep(5000);
        act.moveToElement(ele1).clickAndHold().build().perform(); //pointer not release
        
        Thread.sleep(5000);
        act.moveToElement(ele1).contextClick().build().perform(); //right click
        
        Thread.sleep(5000);
        act.moveToElement(ele1).doubleClick().build().perform();  //open
        
        Thread.sleep(5000);
        //to locate leave modul
        WebElement ele2=driver.findElement(By.className("oxd-main-menu-item"));
        Thread.sleep(5000);
        act.moveToElement(ele2).clickAndHold().build().perform();
        Thread.sleep(5000);
        act.moveToElement(ele2).contextClick().build().perform();
        Thread.sleep(5000);
        act.moveToElement(ele2).doubleClick().build().perform();
        
        
        

        


	}

}
