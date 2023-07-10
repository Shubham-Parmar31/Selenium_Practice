package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingWebElement {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.https://opensource-demo.orangehrmlive.com/web/index.php/auth/login.com");
	
	WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'oxd')]"));
	
	File src=ele.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/myntra.png");
	Files.copy(src, dest);
	driver.quit();
}
}
