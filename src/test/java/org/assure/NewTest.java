package org.assure;

import org.testng.annotations.Test;

public class NewTest {
  
	  @Test(priority =2)
	  private void tc01()
	  {
	  	System.out.println("test2");
	  }
	  @Test(priority =1)
	  private void tc02()
	  {
	  	System.out.println("test3");
	  }
	  @Test()
	  private void tc03()
	  {
	  	System.out.println("test32");
	  }
	  
	  @Test
	  private void tc99()
	  {
	  	System.out.println("testooo");
	  }

	  
}
