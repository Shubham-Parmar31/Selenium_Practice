package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPreceding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//find email text field from password text field
		
		//driver.findElement(By.xpath("//div[@class='_6lux']/preceding-sibling::div/input")).sendKeys("shubhsm");
		driver.findElement(By.xpath("//div[@class='_6lux']/preceding-sibling::div/input[@id='email']")).sendKeys("shubhsm");
		
		//find password text field from forgot pass. link
		
		//driver.findElement(By.xpath("//div[@class='_6ltj']/preceding-sibling::div/div[2]/div/input")).sendKeys("123456789");
		//driver.findElement(By.xpath("//div[@class='_6ltj']/preceding-sibling::div/div/div/input")).sendKeys("123456789");
		//driver.findElement(By.xpath("//div[@class='_6ltj']/preceding-sibling::div/div[2]//input")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[@class='_6ltj']/preceding-sibling::div//input[@id='pass']")).sendKeys("123456789");
		
		//find login button from create new acc. button
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/preceding-sibling::div/button")).click();
	}

}
