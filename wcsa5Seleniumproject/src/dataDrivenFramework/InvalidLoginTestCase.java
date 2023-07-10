package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-bnk08khg/login.do");
		
		Flib fb = new Flib();
		int rc = fb.getLastRowCount("./data/ActitimeTestCase.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(fb.readExcelData("./data/ActitimeTestCase.xlsx","invalidcreds",i,0));
			driver.findElement(By.name("pwd")).sendKeys(fb.readExcelData("./data/ActitimeTestCase.xlsx","invalidcreds",i,1));
			driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("pwd")).clear();
		}
		driver.quit();
		
	}
}
