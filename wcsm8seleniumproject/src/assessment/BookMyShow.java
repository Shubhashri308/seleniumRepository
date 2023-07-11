package assessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookMyShow {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//pass the url and open the book my show
		driver.get(" https://in.bookmyshow.com/explore/home/");
		Thread.sleep(2000);
		//it is used to click on bangaluru
		driver.findElement(By.xpath("//div[@class='sc-ccLTTT dJbCqU']/img[@alt='BANG']")).click();
		//it is used to click on signin
		
		driver.findElement(By.xpath("//div[@class='sc-iGPElx jsSlsO']")).click();
		
		//it is used to click on continue with email
		driver.findElement(By.xpath("//span[@class='sc-ibxdXY gaVJvo']/img[@alt='email logo']")).click();
		//enter the mail id
		driver.findElement(By.id("emailId")).sendKeys("testusersel@yopmail.com");
		
		//click on continue
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		driver=new ChromeDriver();
		
		//navigate to yopmail.com
		
		driver.get("https://yopmail.com/");
		
		//type mail id in inbox  text field
		Thread.sleep(2000);
		
		WebElement indexBox = driver.findElement(By.id("login"));
		indexBox.sendKeys("testusersel@yopmail.com");
		driver.findElement(By.xpath("//i[text()='']")).click();
		//copy the otp
		
		Thread.sleep(1000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='ifmail']"));
		driver.switchTo().frame(frameElement);
		  
		WebElement otpelement = driver.findElement(By.xpath("//td[contains(@style,'text-d')]"));
		
				
	Actions act = new Actions(driver);
	act.doubleClick(otpelement).perform();
	Thread.sleep(2000);
	for (int i = 1; i <= 2; i++) {
		act.clickAndHold(otpelement).perform();
		
	}
	Thread.sleep(2000);
	
	   Robot robot = new Robot();
	    
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_C);
	   
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_C);
	   
	   //navigate back to sign in page
	   
	   robot.keyPress(KeyEvent.VK_ALT);
	   robot.keyPress(KeyEvent.VK_TAB);
	   
	   robot.keyRelease(KeyEvent.VK_TAB);
	   robot.keyRelease(KeyEvent.VK_ALT);
	   
	   Thread.sleep(2000);
	   
	   //paste the  OTP
	   
	   
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_V);
	   
	   //click on Continue button
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='Continue']")).click();
	   
	   //if we  click on continue button but next step won't be performed because of json is not valid
	   //if it is not there i will go for below code
	   
	   //i will check for "Hi Guest" and verify by isDisplayed mathod with if block block
	   
	   /*if()
	  {
		   
	   }*/
	   
	   
	   
	   }


	}


