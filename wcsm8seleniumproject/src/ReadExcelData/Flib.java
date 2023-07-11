package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelpath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();

		return data;



	}
	public int rowcount(String excelpath,String sheetName ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc=sheet.getLastRowNum();
		return rc;



	}

	public void writeExcelData(String excelpath,String sheetName, int rowcount, int cellcount,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);


	}
	

}
