package test_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void method1() {
	  
	  long threadId1 = Thread.currentThread().getId();
	  Reporter.log("This method 1: "+threadId1, true);
  }
  
  @Test
  public void method2() {
	  
	  long threadId2 = Thread.currentThread().getId();
	  Reporter.log("This method 2: "+threadId2, true);
  }
}
