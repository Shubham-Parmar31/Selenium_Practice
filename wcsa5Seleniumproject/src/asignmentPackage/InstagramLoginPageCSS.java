package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPageCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("shubham123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password'] ']")).sendKeys("sh1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='_acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ispan[class='_ab37']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[tabindex='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class*='_aaco']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[class*='_aa48 _aa49']")).click();
		Thread.sleep(2000);


	}

}
