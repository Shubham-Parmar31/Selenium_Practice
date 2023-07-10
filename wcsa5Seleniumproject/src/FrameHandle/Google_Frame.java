package FrameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.co.in");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();  //TO click on menu
	
	//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='callout']"));
	driver.switchTo().frame("app");
	
//	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='tX9u1b']/span[text()='Maps']")))).click();   //To click on google maps 

	driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Dhule",Keys.ENTER);
}
}
