package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitReusableMethod {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-bnk08khg/login.do");
	
	String title= driver.getTitle();
	explicitWait(driver,20,"actiTIME");   //Calling method   
	
	System.out.println("Test case is passed!");
	driver.findElement(By.name("username")).sendKeys("admin"); //username
	driver.findElement(By.name("pwd")).sendKeys("manager");    //password
	driver.findElement(By.id("loginButton")).click();          //login button

}
public static void explicitWait(WebDriver driver,int sec,String title)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
	wait.until(ExpectedConditions.titleContains(title));
}
}
