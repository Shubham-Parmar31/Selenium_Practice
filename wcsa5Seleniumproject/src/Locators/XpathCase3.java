package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver0","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d' and @maxlength='75']")).sendKeys("shubham123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@arialabel='Password' or @type='password']")).sendKeys("shubh@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in' and contains(@class,'x9f61')]")).click();

	}

}
