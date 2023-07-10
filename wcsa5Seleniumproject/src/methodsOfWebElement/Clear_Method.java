package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://laptop-bnk08khg/login.do");
	
	WebElement usn = driver.findElement(By.name("username"));
	usn.sendKeys("admin");
	WebElement pwd = driver.findElement(By.name("pwd"));
	pwd.sendKeys("manager");
	Thread.sleep(1000);
	
    usn.clear();
	pwd.clear();
	
}
}
