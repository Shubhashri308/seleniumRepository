package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.xpath("//input[@id='id_userLoginId' and (@name='userLoginId')]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_password' and (@name='password')]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and text()='Sign In']")).click();

	}

}
