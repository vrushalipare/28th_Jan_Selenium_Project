package EXCEL_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_AllData_In_A_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\Jan 28th Evening Batch.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellindex;i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");//abc abc1 xyz xyz1 
		}
	}

}
