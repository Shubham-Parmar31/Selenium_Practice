package test_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	  public void method3() {
		  
		  long threadId3 = Thread.currentThread().getId();
		  Reporter.log("This method 3: "+threadId3, true);
	  }
	
	@Test
	  public void method4() {
		  
		  long threadId4 = Thread.currentThread().getId();
		  Reporter.log("This method 4: "+threadId4, true);
	  }
}
