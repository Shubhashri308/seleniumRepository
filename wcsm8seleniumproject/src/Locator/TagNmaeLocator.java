package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNmaeLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Mangesh/Desktop/p1.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instgram.com/");
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");
		
		
		
		
		
		
		
		
		
		
		

	}

}
