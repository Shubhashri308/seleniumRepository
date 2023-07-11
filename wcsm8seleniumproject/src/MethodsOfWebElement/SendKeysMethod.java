package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=72qf5f820rhn2");
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
	   // Thread.sleep(2000);
	    //driver.navigate().refresh();
	    
        //driver.findElement(By.name("username")).sendKeys("admin123");
		//driver.findElement(By.name("pwd")).sendKeys("manager123");
		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		passwordTB.sendKeys("manager");
		
	    
	    
	    
		
		
		
		
		

	}

}
