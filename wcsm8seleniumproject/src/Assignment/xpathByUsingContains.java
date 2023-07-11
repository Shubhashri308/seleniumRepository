
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByUsingContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
          driver.findElement(By.xpath("//button[contains(text(),' in')]")).click();
	}

}
