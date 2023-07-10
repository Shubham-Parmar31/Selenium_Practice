package handlePopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
     	WebElement element = driver.findElement(By.id("uploadfile"));
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		ac.doubleClick(element).perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIt Programs/ImageUpload.exe");

	}

}
