package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@class='form-control form-select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Parmar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@tabindex='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dobDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("girse123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("shubh3112");
		Thread.sleep(2000);
		driver.findElement(By.xpath("///input[@id='defaultCheck1']")).sendKeys("shubh3112");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='form-check-label font-14']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		Thread.sleep(1000);
	}

}
