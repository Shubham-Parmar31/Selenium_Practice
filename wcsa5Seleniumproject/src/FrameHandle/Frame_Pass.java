package FrameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Pass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/frame.html");
		
		driver.findElement(By.id("i2")).sendKeys("sh123@gmail");  //enter text into email TB
	    driver.switchTo().frame("i3");   //switch frame
	    driver.findElement(By.id("i1")).sendKeys("123r4r5");  //enter text into pass TB
	    driver.switchTo().defaultContent();     //switch to main frame
	    driver.findElement(By.id("i2")).clear();  //clear text from emailTB
	
	
	}
}
