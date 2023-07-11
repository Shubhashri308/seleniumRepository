package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///C:/Users/Mangesh/Desktop/p6.html");
		 WebElement dropdown = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		sel.selectByValue("v3");
		sel.selectByVisibleText("Bryanai");

	}

}
