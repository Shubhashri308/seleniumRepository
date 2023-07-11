package DataDrivernFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vaidlogintestcase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://127.0.0.1/login.do;jsessionid=1zrmm55g6fqo");
		  Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readexceldata("./data/ActiTime.xlsx","validcred",1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readexceldata("./data/ActiTime.xlsx","validcred",1, 1));
		driver.findElement(By.id("loginButton")).click();
		

	}

}
