package MouseKeyboardMoments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOnScroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        
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
        
        Thread.sleep(10000);
        //import Action class
        Actions act=new Actions(driver);
        
        //locating orangeHRM, Inc link-----way 1
        //WebElement link=driver.findElement(By.linkText("OrangeHRM, Inc"));
        //act.scrollToElement(link).build().perform();
        
        //way 2
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("down");
        WebElement link=driver.findElement(By.linkText("OrangeHRM, Inc"));
        System.out.println(link.getTagName());
        
        act.scrollByAmount(10, 180).build().perform();
        
        Thread.sleep(10000);
        act.sendKeys(Keys.PAGE_UP).build().perform();
        System.out.println("up");
        
        //located time at work text----paragraph tag
        WebElement para=driver.findElement((By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")));
        System.out.println(para.getText());
        
        
        
        

	}

}
