package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demopara 
{
	
  @Test @Parameters({"v1" , "v2"})
  public void ad(int a , int b) 
  {
	  System.out.println("addition =" +(a+b));
	  
	  
  }
}
