package KeyValuDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt=new BaseTest();
		bt.openbrowser();
		
		flib fli = new flib();
		driver.findElement(By.name("username")).sendKeys(fli.readpropertdata("./data/config1.properties","Username"));
		driver.findElement(By.name("pwd")).sendKeys(fli.readpropertdata("./data/config1.properties","Password"));
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(2000);
		bt.closebrowser();
		

	}

}
