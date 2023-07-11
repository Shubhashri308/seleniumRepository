package PopUpHandle;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement target = driver.findElement(By.id("uploadfile"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Runtime.getRuntime().exec("./Autoit/omayo.exe");
		//driver.quit();	
		
		

	}

}
