package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open")).click();
	
		String parentHandle = driver.getWindowHandle();
		
	    Set<String> allHnadles = driver.getWindowHandles();
	    for(String wh:allHnadles)
	    {
	    	if (!parentHandle.equals(wh))
	    	{
	    		driver.switchTo().window(wh).close();
			}
	    }
	}
}
