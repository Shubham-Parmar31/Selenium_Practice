package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// TO read the data from excel file
	public String readExcelData(String filePath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	// To access the last row number
	public int getLastRowCount(String filePath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowNum = sheet.getLastRowNum();
		return rowNum;	
	}
	
	//TO write a data in excel file
	public void writeDataInExcel(String filePath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
	}
	
}