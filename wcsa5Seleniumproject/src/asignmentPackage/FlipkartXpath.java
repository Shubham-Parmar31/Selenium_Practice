package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--diable-notifications");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search ')]")).sendKeys("hp laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Processor']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
}
}
