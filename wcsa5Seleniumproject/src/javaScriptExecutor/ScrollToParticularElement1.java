package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularElement1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://selenium.dev");

	WebElement element=driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(false);",element);
}
}
