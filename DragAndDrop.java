package MouseKeyboardMoments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//to switch on frame
		driver.switchTo().frame(0);
		
		//to locate draggable and droppable element
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		
		//way1
		//act.clickAndHold(source).build().perform();
		//act.moveToElement(target).build().perform();
		//act.release().build().perform();

		//way2
		act.dragAndDrop(source, target).build().perform();
		
		//checkpoint
		boolean res=driver.getPageSource().contains("Dropped!");
		if(res)
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Teat Failed");
		}


	}

}
