package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignUpLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("7589462113");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Shubham Parmar");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("shp1332@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.className("_3GOZo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("referral")).sendKeys("Fe12456ef");
		Thread.sleep(2000);
		driver.findElement(By.className("a-ayg")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("otp")).sendKeys("1554");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("VERIFY OTP")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='_22fFW icon-close-thin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms & Conditions")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("login to your account")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span[class='_22fFW icon-close-thin']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
