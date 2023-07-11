package Takescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class eventFiringwebDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.co.in/");
		  EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		  File src = efw.getScreenshotAs(OutputType.FILE);
		  File desc = new File("./screenshot/sc6.jpg");
		  
		  Files.copy(src, desc);

	}

}
