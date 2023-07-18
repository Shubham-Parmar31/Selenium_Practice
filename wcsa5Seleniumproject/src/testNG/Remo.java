package testNG;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("SQl",Keys.ENTER);
	  
	  Thread.sleep(1000);
	  driver.close();
	  Reporter.log("This is Remo class..!", true);
  }
}
