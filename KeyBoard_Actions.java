package MouseKeyboardMoments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        //login process
      //to locate username textbox
        WebElement un=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		
        //to locate password textbox
        WebElement pw=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        
        Actions act=new Actions(driver);
        
        un.sendKeys("adm");
        
        Thread.sleep(5000);
        un.sendKeys(Keys.TAB); //downword //way1
        //act.sendKeys(Keys.DOWN).build().perform(); //way2
       
        Thread.sleep(5000);
        pw.sendKeys("admin123");
        
        Thread.sleep(5000);
        pw.sendKeys(Keys.chord(Keys.SHIFT, Keys.TAB)); //upword //way1
        //act.sendKeys(Keys.UP).build().perform();  //way2
        
        Thread.sleep(5000);
        un.sendKeys(Keys.CLEAR); //way1
        //act.sendKeys(Keys.CLEAR).build().perform(); //way2 
        //un.sendKeys(Keys.chord(Keys.CONTROL , "a" ,Keys.DELETE)); //way2(i)
        
        Thread.sleep(5000);
        un.sendKeys("Admin");
      
        //to locate login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
       

	}

}
