package DataDrivenFramework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		
		 //impliciteWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	     driver.manage().window().maximize();
	      
	      //login process
	      //to locate user name textbox
	      driver.findElement(By.className("oxd-input")).sendKeys("Admin");
	      
	      //to locate password textbox
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      
	      //to locate login button
	      driver.findElement(By.className("oxd-button")).click();
	      
	      //Test 1---Adding skills
	      //to navigate skills page
	      Thread.sleep(5000);
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSkills");
	      
	      //to locate add skills button
	      driver.findElement(By.className("oxd-button--secondary")).click();
	      
	      //Thread.sleep(5000);
	      //read the skill
	      //way---1
	      BufferedReader br=new BufferedReader(new FileReader("C:\\Automation Testing\\Automation\\skill.txt"));
	      String data=br.readLine();
	      br.close();
	      
	      //way---2
	      //File f=new File("C:\\\\Automation Testing\\\\Automation\\\\skill.txt");
	      //FileReader fr=new FileReader(f);
	      //BufferedReader br=new BufferedReader(fr);
	      //String line=br.readLine();
	      
	      Thread.sleep(5000);
	      //locate name textbox
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(data);
	      
	      Thread.sleep(5000);
	      //locate click on save button
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	      
	      Thread.sleep(5000);
	      //Test 2---updating skills
	      //to navigate skills page
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSkills/38");
	      
	       Thread.sleep(10000);
	       //to locate name textbox
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(" pgm1");
	      
	      Thread.sleep(5000);
	      //click on save
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	      
	      //write status in file
	      BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Automation Testing\\Automation\\skill2.txt"));
	      
	      Thread.sleep(5000);
	      boolean res=driver.getPageSource().contains("Skills");
	      if(res)
	      {
	    	  bw.write("skills updated");
	      }
	      else
	    	  {
	    	  bw.write("skills not updated");
	          }
	      bw.close();      

	}

}
