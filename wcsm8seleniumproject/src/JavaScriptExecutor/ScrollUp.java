package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//scrolling operation
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//scrolling right
		jse.executeScript("window.scrollBy(1000,0)");
		
		//scrolling left
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,5000)");		
		
		
		

	}

}
