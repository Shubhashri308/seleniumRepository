package PopUpHandle;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner sc = new Scanner(System.in);
		     String browservalue = sc.next();
		     System.out.println("enter the bowser name");
		     if (browservalue.equalsIgnoreCase("chrome")) {
		    	 
		    	 ChromeOptions co = new ChromeOptions();
		    	 co.addArguments("--disable-notifications");
		    	    driver =new ChromeDriver(co);
		    	    driver.manage().window().maximize();
		    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    	    driver.get("https://www.easemytrip.com/");
		    	    
		    	   }
		     else if(browservalue.equalsIgnoreCase("edge"))
		     {
		    	EdgeOptions eo = new EdgeOptions();
		    	eo.addArguments("--disable-notifications");
		    	driver=new EdgeDriver(eo);
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    	driver.get("https://www.easemytrip.com/");
		    	 
		     }
		     else 
		     {
		    	 System.out.println("enter  the valid browser");
		    	 
		     }
		     
		     

	}

}
