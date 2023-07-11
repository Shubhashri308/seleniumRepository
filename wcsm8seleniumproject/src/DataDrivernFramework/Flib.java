package DataDrivernFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//it is used to read the data ftom excel sheet
		
public String readexceldata(String excelpath,String sheetname, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
		{
	 FileInputStream fis = new FileInputStream(excelpath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet(sheetname);
	  Row row = sheet.getRow(rowcount);
	  Cell cell = row.getCell(cellcount);
	  String data = cell.getStringCellValue();
	  return data;
		}

//it is used to get the last rowcount of data or sheet
public  int   getlastrowcount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
{
	   FileInputStream fis = new FileInputStream(excelpath);
	     Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetname);//get into the sheet
	    int rc = sheet.getLastRowNum();//read the last row count
	    return rc;
}
//it is used to write the data into excel
public void writedata(String excelpath, String Sheetname, int rowcount,int cellcount, String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelpath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet(Sheetname);
	 Row row = sheet.getRow(rowcount);
	 Cell cell = row.createCell(cellcount);
	 cell.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(excelpath);
	 wb.write(fos);
}






	}


