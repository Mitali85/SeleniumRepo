package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		        //to locate parent element is para(p) tag------self node anchor(a) tag
		        String para=driver.findElement(By.xpath("/html/body/div[2]/div/div/p/a/parent::p")).getText();
		        System.out.println(para);
	
		        //to locate ancestor element is div tag------self node anchor tag
				String tag=driver.findElement(By.xpath("/html/body/div[2]/div/div/p/a/ancestor::div")).getTagName();
				System.out.println(tag);
				
				//to locate descendant element input firstname tag------self node div tag
				driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/descendant::input")).sendKeys("Mitali");
				
				Thread.sleep(5000);
				//to locate child element input yes option tag------self node lable tag
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/child::input")).click();
				
				Thread.sleep(5000);
				//to locate preceding sibling element login link------self node register link
				driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[2]/preceding-sibling::a")).click();
				
				Thread.sleep(5000);
				//to locate following sibling element forgot password link------self node register link
				driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[2]/following-sibling::a")).click();  //a is tagname
		
				
				
				
				
				
		
		
		
		

	}

}
