package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		 ChromeOptions co=new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(co);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(2000);
		 
		// driver.findElement(By.n)

	}

}
