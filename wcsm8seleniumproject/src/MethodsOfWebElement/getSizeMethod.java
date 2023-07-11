package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.selenium.dev/");
		Dimension ele = driver.findElement(By.xpath("//h2[@class='selenium']")).getSize();
		    int newheight = ele.getHeight();
		    int newweight = ele.getWidth();
		    System.out.println("height :" +newheight+ "weight" +newweight);
		

	}

}
