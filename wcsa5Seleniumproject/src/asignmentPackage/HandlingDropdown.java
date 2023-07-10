package asignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/Web%20Element/MultiDropdown.html");
	
	WebElement multiDD = driver.findElement(By.id("menu"));
	Select sel=new Select(multiDD);
	List<WebElement> dropDown = sel.getOptions();
	
	for (WebElement we : dropDown) 
	{	
		if (we.getText().equals("Menu Card"))
		{
			we.click();
			break;
		}
	}
}
}
