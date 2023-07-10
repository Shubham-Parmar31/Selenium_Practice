package handlePopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/Web%20Element/File%20Upload.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("resumeupload"));
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIt Programs/FileUpload.exe");
		
	}
}
