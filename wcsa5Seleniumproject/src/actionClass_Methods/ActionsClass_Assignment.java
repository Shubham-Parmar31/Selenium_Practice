package actionClass_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsClass_Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//To launch the web app
		driver.get("https://bluestone.com/");
		
		//To perform the mouse action
		Actions act=new Actions(driver);
		
		//To perform mouseHover action 
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Coins']"))).perform();
		
		//To select 1gram coin
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
		
		//To verify 1gram coin is displayed or not
		if(driver.findElement(By.id("details-top-right-inner")).isDisplayed())
		{
			System.out.println("Coin is Displayed..");
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("Exception..!");
		}

	}

}
