package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1_Bluestone {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://bluestone.com/");
	
	//To perform mouse action
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"))).perform();
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	
	act.doubleClick(driver.findElement(By.xpath("//div[text()='Filter by']"))).clickAndHold().perform();
	Thread.sleep(2000);
	Robot robot=new Robot();
	//To copy the text
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	
	driver.findElement(By.id("search_query_top_elastic_search")).click();
	//To paste the text
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	//To press Enter key
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
	{
		Thread.sleep(2000);
		System.out.println("Test case is passed..!");
		driver.quit();
	}
	else
	{
		System.out.println("Exception..!");
	}	
}
}
