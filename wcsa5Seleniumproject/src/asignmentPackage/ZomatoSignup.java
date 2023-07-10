package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Full Name']")).sendKeys("shubham");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("shubh212@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		
		
		
		

	}

}
