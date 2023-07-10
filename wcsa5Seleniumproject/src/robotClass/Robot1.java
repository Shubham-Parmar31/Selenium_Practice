package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	//To  keyboard actions
	Robot robot=new Robot();
	//to hit control button
	robot.keyPress(KeyEvent.VK_CONTROL);
	//to hit P button
	robot.keyPress(KeyEvent.VK_P);
	//to release control button
	robot.keyRelease(KeyEvent.VK_CONTROL);
	//to release p button
	robot.keyRelease(KeyEvent.VK_P);
	Thread.sleep(2000);
	//To press tab key	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	//To hit enter button
	robot.keyPress(KeyEvent.VK_ENTER);	
	
}
}

