package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp laptop");
		driver.findElement(By.xpath("//input[@class='_3704LK']/../..//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Processor Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Intel']")).click();
		//driver.quit();
		
		
		
		
		
		

	}

}
