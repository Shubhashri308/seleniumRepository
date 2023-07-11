package PopUpHandle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filehandlepopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://127.0.0.1/login.do;jsessionid=8hpqgipqcteq8");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@class='content administration']/descendant::img[@class='sizer']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Runtime.getRuntime().exec("./Autoit/actifile.exe");
		// String abs = File.getAbsolutePath();
		
		
		

	}

}
