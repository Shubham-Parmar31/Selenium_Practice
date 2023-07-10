package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadAllDatafromExcel {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	for(int i=1;i<=10;i++)
	{
		for(int j=0;j<=1;j++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		    Workbook wb = WorkbookFactory.create(fis);
		    Sheet sheet = wb.getSheet("IPL");
		    Row row = sheet.getRow(i);
		    Cell cell = row.getCell(j);
		    String data = cell.getStringCellValue();
		    System.out.print(data);
		    System.out.println();
		}
	}
}
	
}
