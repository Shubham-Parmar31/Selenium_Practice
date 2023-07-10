package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://laptop-bnk08khg/login.do");
	
	// Verifying Login page is displayed or not
	String title = driver.getTitle(); //Login page
	if (title.equals("actiTIME - Login")) {
		System.out.println("Test case is passed!");
		driver.findElement(By.name("username")).sendKeys("admin"); //username
		driver.findElement(By.name("pwd")).sendKeys("manager");    //password
		driver.findElement(By.id("loginButton")).click();          //login button
	}
	else {
		System.out.println("We will get error!");
	}
	
	// Verifying home page is displayed or not
	String homeTitle = driver.getTitle();// Home page
	if (homeTitle.equals("actiTIME - Enter Time-Track")) {
		System.out.println("Test case is passed!");
		driver.findElement(By.linkText("Logout")).click();     //logout button
	}
	else {
		System.out.println("Test case is failed!");
	}
}

}
