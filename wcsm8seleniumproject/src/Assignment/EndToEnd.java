package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
		
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		String titleofwatchpage = driver.getTitle();
		if(titleofwatchpage.equals("Amazon.in : watch"))
		{
			System.out.println("");
		}
		else 
		{
			
		}
	    String parentwindow = driver.getWindowHandle();// address of parent window
		
      driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).click();
      Set<String> allwindows = driver.getWindowHandles();// address of parent and child 
      
      for(String wh:allwindows)
      {
    	 if(!parentwindow.equals(wh))
    	 {
    		 driver.switchTo().window(wh);
    		 break;
    	 }
    	  
      }
      
      
      
      
//      for(String wi : allwindows)
//      {
//      if (driver.getTitle().equals("Daniel Wellington Analog Green Dial Women's Watch-DW00100480 : Amazon.in: Fashion")) {
//    	  driver.switchTo().window(wi);
//		break;
//	   } 
//      
      }
      
	}


