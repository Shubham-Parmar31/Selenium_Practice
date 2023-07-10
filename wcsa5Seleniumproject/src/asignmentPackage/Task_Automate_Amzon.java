package asignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Automate_Amzon {

	static JavascriptExecutor js;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));  //explicit wait


		//To launch the webapp
		driver.get("https://www.amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");  //to enter text into search box
		driver.findElement(By.id("nav-search-submit-button")).click();         //To click on search icon
		driver.findElement(By.xpath("//img[contains(@alt,'Samsung Galaxy M04 Dark Blue, 4GB RAM, 1')]")).click();  //select particular product

		
		//To get handle of window
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				Thread.sleep(1000);
				js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
			    driver.findElement(By.xpath("//img[@alt='Sea Glass Green']")).click();     //Select a color	
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//p[text()='4/64GB']")).click();  //select the size
			    js.executeScript("window.scrollBy(0,-300)");
				
			    // click on delivery link
			     WebElement element = driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine"));
			    js.executeScript("arguments[0].click();",element);
			    
				driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411033"); //enter text to pin text field
				
				//click on apply button
				WebElement apply = driver.findElement(By.id("GLUXZipUpdate-announce"));    
				js.executeScript("arguments[0].click();",apply);
				
				//Add to cart
				
     			
			}
		}
	}

}
