package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("shubh12@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("shubham@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*=' _4jy6 _4jy1 s'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class*='sp_5xG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class*='_6ltj'] ")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[data-testid*='open'] ")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class*='_8esh']  ")).click();
		Thread.sleep(2000);
		
		
		

	}

}
