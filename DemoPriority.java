package testNG;

import org.testng.annotations.Test;

public class DemoPriority {
  @Test(priority = 2)
  public void t() 
  {
	  System.out.println("This is a t method");
  }
  
  @Test(priority = 3)
  public void c()
  {
	  System.out.println("This is a c method");
  }
  
  @Test(priority = 1)
  public void g()
  {
	  System.out.println("This is a g method");
  }

  
}
