package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{

	static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib fb = new Flib();
		String browserValue = fb.readPropertyData(Prop_Path,"browser");
		String urlValue = fb.readPropertyData(Prop_Path,"url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Chrome_Key,Chrome_Path);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(Gecko_Key,Gecko_Path);
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(Edge_Key,Edge_Path);
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the valid browser name..!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(urlValue);
	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
