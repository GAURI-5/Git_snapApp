package com.snap.testing;

import org.testng.Assert;
import org.testng.annotations.Test;




public class SecondTest {
	@Test(priority=0)//invocationCount=6, threadPoolSize=2)//invocationCount=3)
	  public void log() {
	      System.out.println("Log method");
	      Assert.assertEquals(true, false);
	      System.out.println("Thread id: "+Thread.currentThread().getId());
	  }

	  @Test(priority=1)//dependsOnMethods="addtocart")
	  public void search() {
	      System.out.println("Search method");
	      Assert.assertEquals(true, false);
	  }

	  @Test(priority=2)//dependsOnMethods= {"log","checkout"})
	  public void addtocart() {
	      System.out.println("add to cart method");
	  }

	  @Test(priority=3)
	  public void checkout() {
	      System.out.println("checkout method");
	  }
	  
  

	
}

