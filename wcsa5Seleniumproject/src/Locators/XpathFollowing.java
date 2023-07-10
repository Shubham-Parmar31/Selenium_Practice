package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowing {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/emailsignup/");
	Thread.sleep(2000);
	
	//find email text field from login with facebook button
	driver.findElement(By.xpath("//button[contains(text(),'Log')]/../following-sibling::div//label/input[@name='emailOrPhone']")).sendKeys("9874561230");
	
	//find full name text field from email text field
	driver.findElement(By.xpath("//div[@class='_aahy']/following-sibling::div/div/label/input[@name='fullName']")).sendKeys("Shubham");
	
	//find username text field from full name text field
	driver.findElement(By.xpath("//div[@class='_aahy']/following-sibling::div/div/label/input[@name='username']")).sendKeys("shubh3112");
	
	//find password text field from eamil text field
	driver.findElement(By.xpath("//div[@class='_aahy']/following-sibling::div/div/label/input[@name='password']")).sendKeys("123456789");
	
	//find signup button from login with facebook button
	driver.findElement(By.xpath("//button[contains(text(),'Facebook')]/../following-sibling::div//button[text()='Sign up']")).click();
	}
}
