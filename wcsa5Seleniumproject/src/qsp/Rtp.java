package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//to take user input-----> use scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("Which browser you want to open");
		String browservalue= sc.next();
		if (browservalue.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else if (browservalue.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver.", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else if (browservalue.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else {
			System.out.println("Enter the valid browser name");
		}
	}

}
