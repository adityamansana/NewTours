package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername"))).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Welcome Admin"))).isDisplayed())
		{
			System.out.println("Test Case is passed.");
		}
		
		else
		{
			System.out.println("Test Case is failed.");
		}
		
	}

}
