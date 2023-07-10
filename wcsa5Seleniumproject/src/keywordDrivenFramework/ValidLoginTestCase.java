package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib fb = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(fb.readPropertyData(Prop_Path, "username"));
		driver.findElement(By.name("pwd")).sendKeys(fb.readPropertyData(Prop_Path, "password"));
		driver.findElement(By.id("loginButton")).click();
		bt.closeBrowser();	
	}
}
