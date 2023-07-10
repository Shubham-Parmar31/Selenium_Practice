package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	String value = driver.findElement(By.name("username")).getAttribute("class");
//	System.out.println(value);
	
	System.out.println(driver.findElement(By.name("username")).getAttribute("placeholder"));
	
}
}
