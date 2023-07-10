package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_Selenium {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		//To perform mouse actions
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='Downloads']"))).perform();
		
		//TO perform keyboard actions
		Robot robot=new Robot();
		for (int i = 1; i<=6; i++) 
		{
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
}
