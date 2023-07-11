package DropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///C:/Users/Mangesh/Desktop/p6.html");
		//driver.get("file:///C:/Users/Mangesh/Desktop/p5.html");
		 WebElement dropdown = driver.findElement(By.id("i1"));
		   Select sel = new Select(dropdown);
		  List<WebElement> allops = sel.getOptions();
		  for (WebElement ops:allops) {
			if(ops.getText().equals("chakali")){
			  ops.click();
			}
		  }
		  
		   
		
		   

	}

}
