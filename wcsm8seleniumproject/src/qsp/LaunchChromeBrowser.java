package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();//to avoid connection failed exception
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();//to launch the chrome browser
		driver.manage().window().maximize();// maximize the browser
		Thread.sleep(2000);
		driver.close();  //close the browser
	}

}
