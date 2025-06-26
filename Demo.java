package testNG;

import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() 
  {
	  System.out.println("This is a default test method");
  }
  
  @Test
  public void d()
  {
	  System.out.println("user created method");
  }
}
