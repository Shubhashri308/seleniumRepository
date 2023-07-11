package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimecase {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=batg6xiqkmqk");
	
       String loginpagetitle = driver.getTitle();
       if (waitMethod(driver,30,loginpagetitle)) {
    	   System.out.println("login page title is matched   test case passed");
    	   driver.findElement(By.name("username")).sendKeys("admin");
    	   driver.findElement(By.name("pwd")).sendKeys("manager");
    	   driver.findElement(By.id("loginButton")).click();
    }
       else {
		
    	   System.out.println("the login page tite is not matched test case failed");
	}
         String homepagetitle = driver.getTitle();
         if (waitMethod(driver,20,homepagetitle)) {
        	 System.out.println("home page title is matched   test case passed");
			
		} 
         else {
			 System.out.println("the login page tite is not matched test case failed");

		}
       
		
	}

private static boolean waitMethod(WebDriver driver, int i, String title) {
	// TODO Auto-generated method stub
	
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	       Boolean titleofpage = wait.until(ExpectedConditions.titleContains(title));
	       return titleofpage;
	  
}


}
