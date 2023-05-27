package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_get_row_size {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum()+1;
		System.out.println(rowsize);//4
		
		
		
		
		
		
		
	}

}
