package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printAllDataFromRowAndColumns {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
		int LastRowIndex = sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++) { //outer for loop for rows
			
			int lastColumnIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastColumnIndex;j++) {//inner loops for columns
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
