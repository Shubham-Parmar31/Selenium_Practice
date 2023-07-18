package testngPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() {
	  Reporter.log("This method 1");
  }
  
  @Test
  public void method2() {
	  Reporter.log("This method 2");
  }
}
