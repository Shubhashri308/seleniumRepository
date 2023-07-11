package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConetxtClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       driver.get("file:///C:/Users/Mangesh/Desktop/p6.html");
       WebElement target = driver.findElement(By.id("i1"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        //contextclick no argument methods
        act.contextClick().perform();
        //contet click parameterised method
      act.contextClick(target).perform();
	}

}
