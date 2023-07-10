package keywordDrivenFramework;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib fb = new Flib();
		int rc = fb.getLastRowCount(Excel_Path, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(fb.readExcelData(Excel_Path, "invalidcreds",i,0));
			driver.findElement(By.name("pwd")).sendKeys(fb.readExcelData(Excel_Path, "invalidcreds",i,1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("pwd")).clear();
		}
		bt.closeBrowser();
		
	}
}
