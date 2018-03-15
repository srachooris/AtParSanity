package ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import com.sun.jna.platform.FileUtils;

public class ExcelReader
{
    static Workbook workbook;
    static Sheet sheet;
    static Row row;
    static Cell cell;
    
    public static String getCellData(int r, int c) throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	FileInputStream fis = new FileInputStream("E:\\Sravan\\softwares\\AtParSetup\\src\\TestData\\TestData.xls");
		workbook = WorkbookFactory.create(fis);
		sheet = workbook.getSheet("TestDataSheet");
		row  = sheet.getRow(r);
		cell = row.getCell(c);
		System.out.println("Row accessed");
		
		String cellvalue = cell.getStringCellValue();
		System.out.println("Row accessed1");
		return cellvalue;
		
    	
    }
    
}