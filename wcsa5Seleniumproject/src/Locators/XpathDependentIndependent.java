package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentIndependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		
		//to select departure date from departure calendar
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='June 2023']/../..//p[text()='2']")).click();
		
		//to select return date from return calendar
		driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='July']/../..//div[@aria-label='Mon Jul 03 2023']")).click();
		
		//to select travellers 
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	}
}
