package test_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	  public void method5() {
		  
		  long threadId5 = Thread.currentThread().getId();
		  Reporter.log("This method 5: "+threadId5, true);
	  }
	@Test
	  public void method6() {
		  
		  long threadId6 = Thread.currentThread().getId();
		  Reporter.log("This method 6: "+threadId6, true);
	  }
}
