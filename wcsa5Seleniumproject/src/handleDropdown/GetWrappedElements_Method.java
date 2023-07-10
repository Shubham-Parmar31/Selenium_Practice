package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElements_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/Web%20Element/MultiDropdown.html");
	
	WebElement multiDD = driver.findElement(By.id("menu"));
	Select sel=new Select(multiDD);
	WebElement elements = sel.getWrappedElement();
	System.out.println(elements.getText());
}
}
