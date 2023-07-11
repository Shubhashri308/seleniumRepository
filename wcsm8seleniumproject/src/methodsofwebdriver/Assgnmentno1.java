package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Assgnmentno1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Dimension targetsize=new Dimension(350,450);
		
		Thread.sleep(2000);
		driver.manage().window().setSize(targetsize);
		
		Point targetposition=new Point(450,350);
		Thread.sleep(2000);
		
		driver.manage().window().setPosition(targetposition);
		driver.manage().window().setSize(targetsize);
	}
		}
