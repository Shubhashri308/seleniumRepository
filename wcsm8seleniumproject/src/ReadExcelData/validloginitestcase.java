package ReadExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validloginitestcase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException,IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Flib flib = new Flib();
		 driver.get("http://127.0.0.1/login.do;jsessionid=34bag58b1coax");
		 
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx","validcred",1,0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx","validcred",1,1));
		driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
		
		
		
		
		

	}

}
