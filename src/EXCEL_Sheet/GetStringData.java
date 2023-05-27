package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetStringData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		//Workbook book = WorkbookFactory.create(file);
		//Sheet sh = book.getSheet("sheet1");
		//Row rw = sh.getRow(1);
		//Cell cl = rw.getCell(0);
		//String value = cl.getStringCellValue();
		//System.out.println(value);
		
		String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
