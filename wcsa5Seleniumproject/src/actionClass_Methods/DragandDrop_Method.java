package actionClass_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='James Johns']"));
		WebElement dest = driver.findElement(By.id("u1558367722704"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
}
