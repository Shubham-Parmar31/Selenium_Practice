package asignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterSignupXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();         
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shubham Parmar");   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel'] ")).sendKeys("9876543210");     
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Use email instead'] ")).click();     
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Use phone instead'] ")).click();     
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='SELECTOR_1']")).click();           
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='SELECTOR_2']")).click();           
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_3_LABEL']")).click();  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@tabindex='-1']")).click();            
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='app-bar-back']")).click();    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click();        
		Thread.sleep(2000);
		//driver.quit();

	}

}
