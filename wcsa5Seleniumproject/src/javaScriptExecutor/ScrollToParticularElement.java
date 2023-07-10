package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
	Point loc = element.getLocation();
    int xaxis = loc.getX();
    int yaxis = loc.getY();
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy("+xaxis+",("+yaxis+")-100)");
}
}
