package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentno2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("-remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("manager");
		driver.findElement(By.id("pass")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.navigate().to("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		driver.findElement(By.id("userName")).sendKeys("password");
		driver.findElement(By.id("password")).sendKeys("username");
		
		driver.navigate().to("https://dribbble.com/signup/new");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_login")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.navigate().to("https://mdbootstrap.com/docs/standard/extended/registration/");
		driver.findElement(By.id("form3Example1c")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("manager");
		driver.findElement(By.id("id_password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='signin']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

}
