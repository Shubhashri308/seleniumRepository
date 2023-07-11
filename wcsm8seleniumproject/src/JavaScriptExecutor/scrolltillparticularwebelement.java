package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltillparticularwebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.selenium.dev/");
		WebElement newselemnt = driver.findElement(By.xpath("//h2[text()='News']"));
		
		//to perform scrolling operation for a news elemt
		//location of webelemnt
		  Point loc = newselemnt.getLocation();
		  
		  int xaxis = loc.getX();
		  int yaxis = loc.getY();
		  Thread.sleep(2000);
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("Window.scrollBy("+xaxis+","+yaxis+")");

	}

}
