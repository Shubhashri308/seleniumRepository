package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://127.0.0.1/login.do;jsessionid=3g31ifvoje4id");
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//click on setting
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		//cliclk on custome logo
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	     Actions act=new Actions(driver);
	     act.doubleClick(target).perform();
	
		

	}

}
