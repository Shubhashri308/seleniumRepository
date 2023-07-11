package ReadExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidtestcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=34bag58b1coax");
		for (int i = 0; i < args.length; i++) {
			
		}
		 Flib flib=new Flib();
		 int rc=flib.rowcount("./data/ActiTimeTestData.xlsx","invalidcreds");
		 for (int i = 1; i < rc; i++) {
		String invalidusername = flib.readExcelData("./data/ActiTime.xlsx","invalidcred", rc, 0);
		String invalidpassord = flib.readExcelData("./data/ActiTime.xlsx", "invalidcred", rc, 1);
		
			       
			 driver.findElement(By.name("username")).sendKeys(invalidusername);
				driver.findElement(By.name("pwd")).sendKeys(invalidpassord);
				driver.findElement(By.id("loginButton")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.name("username")).clear();
				 driver.quit();
			
		}
		 
		

	}

}
