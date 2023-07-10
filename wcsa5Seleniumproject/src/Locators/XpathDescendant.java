package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDescendant {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//find the email text field from login form present in the facebook login page(parent to child)
		
		//driver.findElement(By.xpath("//div[@class='_6luv _52jv']/descendant::input[@id='email']")).sendKeys("sh12@gmail.com");
		//driver.findElement(By.xpath("//div[@class='_6luv _52jv']//input[@name='email']")).sendKeys("sh12@gmail.com");
		//driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/input")).sendKeys("sh12@gmail.com");
		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/input[@id='email']")).sendKeys("sh12@gmail.com");
		Thread.sleep(2000);
		
		//find the password text field from parent tag(<div>)
		
		//driver.findElement(By.xpath("//div/div/div/input")).sendKeys("123432123");
		//driver.findElement(By.xpath("//div/div/div/input[@id='pass']")).sendKeys("123432123");
		//driver.findElement(By.xpath("//div//input[@id='pass']")).sendKeys("123432123");
		driver.findElement(By.xpath("//div/descendant::input[@name='pass']")).sendKeys("123432123");
		Thread.sleep(2000);
		
		//find login button from login form 
		
		//driver.findElement(By.xpath("//div[@class='_6luv _52jv']/descendant::button")).click();
		//driver.findElement(By.xpath("//div[@class='_6luv _52jv']//button")).click();
		driver.findElement(By.xpath("//div[@class='_6luv _52jv']//button[text()='Log in']")).click();
		
		
		
		
	}
}
