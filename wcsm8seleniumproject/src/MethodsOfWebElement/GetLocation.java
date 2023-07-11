package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		//by using method chaining
		//System.out.println(driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation().getX() + driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation().getY());
		//By using reference variable
		WebElement ele = driver.findElement(By.xpath("//h2[@class='selenium']"));
		Point loc = ele.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println("x axis :"+xaxis+"  y axis :"+yaxis);
		
		
		
		

	}

}
