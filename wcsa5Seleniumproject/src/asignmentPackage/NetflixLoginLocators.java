package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=' e1ax5wel1 default-ltr-cache-1arlfc3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("shubham@112");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password_toggle")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("login-remember-me-label-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("recaptcha-terms-of-use--link-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign up now")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Need help?")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
