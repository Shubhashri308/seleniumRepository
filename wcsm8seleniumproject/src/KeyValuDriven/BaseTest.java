package KeyValuDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends flib {

	static WebDriver driver;
	public void openbrowser() throws IOException
	{
		  flib fli = new flib();
		  String browservalue = fli.readpropertdata("./data/config1.properties","Browser");
		  String url = fli.readpropertdata("./data/config1.properties","Url");
		  
		  if (browservalue.equalsIgnoreCase("chrome")) {
			  
			  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.get(url);
			  
			}
		  else if(browservalue.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.get(url);
			  
		  }
		  else if(browservalue.equalsIgnoreCase("edge"))
		  {
			  System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.get(url);
		  }
	}
	
	public void closebrowser()
	{
		driver.quit();
	}
}
