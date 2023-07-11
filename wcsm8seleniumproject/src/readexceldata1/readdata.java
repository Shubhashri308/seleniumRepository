package readexceldata1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//read the data from excel sheet
		FileInputStream file = new FileInputStream("./data/TestData.xlsx");
		
		//make the file for ready to read by using create method
		Workbook wb = WorkbookFactory.create(file);//create method present in apache poi jars file 
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		 String value = cell.getStringCellValue();
		 System.out.println(value);
		

	}

}
