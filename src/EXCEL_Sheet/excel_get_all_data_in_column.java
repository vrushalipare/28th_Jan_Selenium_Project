package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_get_all_data_in_column {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex; i++) {
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
			
		}
		
		
		
		
	}

}
