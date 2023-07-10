package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_CloseChildWindow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Open")).click();
	Thread.sleep(2000);
	
	String parenthandle = driver.getWindowHandle();
	Set<String> wh = driver.getWindowHandles();
	
	for(String all:wh)
	{
	  if(!parenthandle.equals(all))
	  {
		driver.switchTo().window(all).close();
	  }
	}
}
}
