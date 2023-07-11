package Optionalmethods;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementTheDuplicateHashset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Mangesh/Desktop/p6.html");
		   WebElement dropDown = driver.findElement(By.name("menu"));
		    Select sel=new Select(dropDown);
		    
		   //to 
		   List<WebElement> alloptions = sel.getOptions();
		   
		   HashSet<String> hs = new HashSet<String>();
		   
		   //to read the list
		   for (int i=0;i<alloptions.size();i++) 
		   {
			   //get the option and text of option
			String op= alloptions.get(i).getText();
			//add the text of option to tresset
			hs.add(op);
		}
		   for (String options:hs) {
			Thread.sleep(2000);
			System.out.println(options); }

	}

}
