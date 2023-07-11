package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethodOfWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//driver.get("http://omayo.blogspot.com/");
		driver.get("https://www.instagram.com/accounts/login/");
		     String loginpage = driver.getPageSource();
		     System.out.println(loginpage);

	}

}
