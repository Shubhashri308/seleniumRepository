package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//scrolling operation
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//scrolling left
		jse.executeScript("window.scrollBy(0,5000)");

	}

}
