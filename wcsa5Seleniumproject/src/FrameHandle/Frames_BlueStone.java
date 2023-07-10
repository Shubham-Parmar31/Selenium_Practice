package FrameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames_BlueStone {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click(); 
	Thread.sleep(1000);
	//driver.switchTo().frame(5);              //To switch frame by using index value
	//driver.switchTo().frame("fc_widget");               // TO switch frame by using name or id
	
	WebElement frameElement = driver.findElement(By.id("fc_widget"));
	driver.switchTo().frame(frameElement);      //To switch frame by using xpath   
	
	driver.findElement(By.id("chat-icon")).click();   //click on chat icon
	
	driver.switchTo().defaultContent();    // TO switch main frame
	driver.findElement(By.id("chat-fc-name")).sendKeys("shubham");
	driver.findElement(By.id("chat-fc-email")).sendKeys("shdaswgyuj@13345r");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("9874561230");
	driver.findElement(By.linkText("Start Chat")).click();
	
}
}
