package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimetextcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=batg6xiqkmqk");
		
		String loginpagetitle=driver.getTitle();
		if (loginpagetitle.equalsIgnoreCase("actiTIME - Login")){
			System.out.println("login page title is matched   test case passed");
	    	   driver.findElement(By.name("username")).sendKeys("admin");
	    	   driver.findElement(By.name("pwd")).sendKeys("manager");
	    	   driver.findElement(By.id("loginButton")).click();
			
		} 
		else {
			System.out.println("the login page tite is not matched test case failed");

		}
		String homepagetitle = driver.getTitle();
		
		if (homepagetitle.equalsIgnoreCase("actiTIME - Enter Time-Track")) {
			System.out.println("home page title is matched   test case passed");
			
		} 
		else
		{
			System.out.println("the login page tite is not matched test case failed");

		}

	}

}
