package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_TestData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://laptop-bnk08khg/login.do");
        
        
		// TO read data from excel file

		FileInputStream fis = new FileInputStream("./data/ActitimeTestCase.xlsx");// To get path of the file
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("validcreds");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);
        String Username = cell.getStringCellValue();
        
        FileInputStream fis1 = new FileInputStream("./data/ActitimeTestCase.xlsx");// To get path of the file
        Workbook wb1 = WorkbookFactory.create(fis1);
        Sheet sheet1 = wb1.getSheet("validcreds");
        Row row1 = sheet1.getRow(1);
        Cell cell1 = row1.getCell(1);
        String validPassword = cell1.getStringCellValue();
        
        driver.findElement(By.name("username")).sendKeys(Username);
        driver.findElement(By.name("pwd")).sendKeys(validPassword);
        driver.findElement(By.id("loginButton")).click();
        
        
        
	}
}
