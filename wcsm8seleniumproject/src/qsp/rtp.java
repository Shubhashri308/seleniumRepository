package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rtp {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the broser which you want to open");
		String browservalue=sc.next();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();//to avoid connection failed exception
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver();//to launch the chrome browser
			driver.manage().window().maximize();// maximize the browser
			Thread.sleep(2000);
			driver.close();  //close the browser
			
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			
		}
		else
		{
			System.out.println("Enter the valid BrowserValue!!!");
		}
		
		
}

}

