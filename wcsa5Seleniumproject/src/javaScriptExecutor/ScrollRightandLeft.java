package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRightandLeft {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(1000,0)");
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(-2000,0)");
    
    
}
}
