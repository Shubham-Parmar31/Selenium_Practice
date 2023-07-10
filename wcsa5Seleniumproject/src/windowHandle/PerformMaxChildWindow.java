package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformMaxChildWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Launch the web application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open")).click();
	
		//get the address of parent window
		String parentHandle = driver.getWindowHandle();
		
		//get the address of all windows
	    Set<String> allHnadles = driver.getWindowHandles();
	    for(String wh:allHnadles)
	    {
	    	if (!parentHandle.equals(wh))
	    	{
	    		Thread.sleep(2000);
	    		driver.manage().window().maximize();
			}
	    }
}
}