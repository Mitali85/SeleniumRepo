package testNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Dataprovider 
{
	
  @Test(dataProvider = "dp" , dataProviderClass = Dataprovider.class)
  public void add(int num1, int num2, int exres) 
  {
	  
	  int sum=num1 + num2;
	  Assert.assertEquals(sum, exres);
  }

  @DataProvider
  public Object[][] dp() 
  {
	  return new Object[][] { {2,3,5 } , {2,6,7} };
        }
  }

