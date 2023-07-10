package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAncestor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");  //facebook login page
		Thread.sleep(2000);
		
		//Find email text field from  create new acc. buttton 
		driver.findElement(By.xpath("//a[text()='Create new account']/../../div/descendant::input[@name='email']")).sendKeys("sh123@gmail.com");
		Thread.sleep(2000);
		
		//find password text field from forgotten pass. link
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/../../div/descendant::div[2]//input[@id='pass']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		//find login button from email text field
		driver.findElement(By.xpath("//div[@class='_6lux']/../..//button[text()='Log in']")).click();
	}
}
