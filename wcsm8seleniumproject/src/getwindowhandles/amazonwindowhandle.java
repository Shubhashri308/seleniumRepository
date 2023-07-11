package getwindowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String parentaddress = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> childaddress = driver.getWindowHandles();
		for (String wh: childaddress) {
			if (!parentaddress.equals(wh)) {
				driver.switchTo().window(wh);
				
			}
			
		}
		
		driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		  

	}

}
