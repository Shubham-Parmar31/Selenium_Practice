package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("which browser you want to open");
		String browservalue = sc.next();
		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		} 
		else if (browservalue.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		}
		else {
			System.out.println("Enter the valid browser name");
		}
	}
}
