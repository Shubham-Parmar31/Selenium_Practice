package handleDropdown;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/shgir/OneDrive/Desktop/Automation%20Testing/Web%20Element/MultiDropdown.html");
		WebElement multi = driver.findElement(By.id("menu"));
		Select sel=new Select(multi);
		List<WebElement> dropdown = sel.getOptions();

		//For loop 
		for(int i=0;i<dropdown.size();i++)
		{
			String op=dropdown.get(i).getText();
			System.out.println(op);
		}

		//For each loop
		for(WebElement we:dropdown)
		{
			String opt=we.getText();
			System.out.println(opt);
		}
	}
}
