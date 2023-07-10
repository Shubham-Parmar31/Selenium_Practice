package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitShopperstack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));  //Adding Implicit wait
		
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));  //Adding Explicit wait
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("electronics")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']"))).click();
		driver.findElement(By.xpath("//img[@alt='realme cy']")).clear();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		driver.findElement(By.id("Check")).click();
	}
}
