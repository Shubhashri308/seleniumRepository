package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		 Rectangle ele = driver.findElement(By.xpath("//h2[@class='selenium']")).getRect();
		     int xaxis = ele.getX();
		     int yaxis = ele.getY();	
		     
		     int height = ele.getHeight();
		     int weight = ele.getWidth();
		     System.out.println("height :" +height+ "weight" +weight+ "xais:"+xaxis+ "yaxis:" +yaxis);

	}

}
