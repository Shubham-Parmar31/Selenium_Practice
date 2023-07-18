package testngPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void method3() {
	  Reporter.log("This is method 3");
  }
  
  @Test
  public void method4() {
	  
	  int i=1;
	  int j=6;
	  int res=j/i;
	  Reporter.log("This method 4");
  }
}
