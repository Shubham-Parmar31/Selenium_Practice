package test_Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
   WebDriver driver;
  @Test
  @Parameters({"browser","url","ValidUsername","ValidPassword"})
  public void browserMethod(String browserValue,String urlValue,String username,String password) {
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();  
	  }
	  else if(browserValue.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		  driver=new EdgeDriver();  
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(urlValue);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
	  driver.quit();
  }
}
