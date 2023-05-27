package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_get_column_size_in_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		short columnsize = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getLastCellNum();
		
		System.out.println(columnsize);//4
		
		
		
		
		
		
	}

}
