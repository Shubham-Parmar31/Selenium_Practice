package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselection_Methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/Web%20Element/MultiDropdown.html");
	WebElement multi = driver.findElement(By.id("menu"));
	Select sel=new Select(multi);
	
//	sel.selectByIndex(2);         // by index
//	  
//	sel.selectByVisibleText("Pohe");   // by visible text
//	
//	sel.selectByValue("v2");       // by value
//	Thread.sleep(2000);
	
//	sel.deselectByValue("v3");
//	sel.deselectByIndex(3);
//	sel.deselectByVisibleText("Vada Pav");
//	
	sel.selectByIndex(2);         // by index
	sel.selectByVisibleText("Pohe");   // by visible text
	sel.selectByValue("v2");
	
//	sel.deselectAll();
	for(int i=0;i<5;i++)
	{
		sel.deselectByIndex(i);
	}
}
}
