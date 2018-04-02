package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoHtmlUnitDriver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Welcome Admin"))).isDisplayed())
			{
					System.out.println("Test Passed");
			}
		
		else
		{
			System.out.println("Test Failed");
		}		
		
	}
		
}


