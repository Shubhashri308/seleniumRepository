package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Systemflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String title = driver.getTitle();
		if (title.equals("Amazon.in : watch")) {
			System.out.println("you are on correct page");
			
		} else {
			System.out.println("you are not on correct page");

		}
		
		String address = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		
		  Set<String> alladdress = driver.getWindowHandles();
		  
		  for(String wh:alladdress)
		  {
			  if (!address.equals(wh)) {
				  
				  driver.switchTo().window(wh);
				  break;
				  
				
			}
		  }
		  //driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		 // driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411033");
		/*Actions act = new Actions(driver);
	 WebElement target = driver.findElement(By.className("a-button-input"));
	 Thread.sleep(2000);
	 act.moveToElement(target).perform();*/
		  
		  driver.findElement(By.id("add-to-cart-button")).click();
		 String textadd = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
		  
		  if (textadd.equals("\r\n"
		  		+ "        Added to Cart\r\n"
		  		+ "    ")) {
			  System.out.println("watch is added sucessfully");
			  
			
		}
		  else
		  {
			  System.out.println("watch is not added sucessfully");
			  
		  }
		  
		  
		  
		  }
		
	

}



