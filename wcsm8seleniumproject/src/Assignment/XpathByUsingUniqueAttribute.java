package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=SHJBTnpWVVc3Zi1EV0drc2wzYzFpVE1SUkw5RXdsajAuSFN5ejk4a2NtfmpG_en-GB_false_&nonce=SHJBTnpWVVc3Zi1EV0drc2wzYzFpVE1SUkw5RXdsajAuSFN5ejk4a2NtfmpG&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=kJBUCKBZVzCkVi1GdfOxS4vTa2o2BB3sY40Vwo8O7yM&ui_locales=en-GB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next']")).click();
		

	}

}
