package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://127.0.0.1/login.do;jsessionid=34bag58b1coax");
	         FileInputStream fis = new FileInputStream("./data/ActiTime.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		     Sheet sheet = wb.getSheet("validcred");
		      Row row = sheet.getRow(1);
		      Cell cell = row.getCell(0);
		     String validusername = cell.getStringCellValue();
		     
		     
		     FileInputStream fis2 = new FileInputStream("./data/ActiTime.xlsx");
			 Workbook wb2 = WorkbookFactory.create(fis2);
			     Sheet sheet2 = wb2.getSheet("validcred");
			      Row row2 = sheet2.getRow(1);
			      Cell cell2 = row2.getCell(1);
			     String validpassword = cell2.getStringCellValue();
			     Thread.sleep(2000);
		     
		  driver.findElement(By.name("username")).sendKeys(validusername);
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys(validpassword);
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
		  

	}

}
