package actionClass_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spicejet.com");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).perform();
		driver.findElement(By.linkText("Visa Services")).click();

	}

}
