package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrentUrlMethodOfWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//driver.get("http://omayo.blogspot.com/");
		driver.get("https://www.instagram.com/accounts/login/");
		     String loginpage = driver.getCurrentUrl();
		     System.out.println(loginpage);
		

	}

}
