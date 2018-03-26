package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmLogin {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://paytm.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@class='_3ac-']")).click();
		Thread.sleep(5000);
	
		d.switchTo().frame(d.findElement(By.xpath("//div[@class='_1MBe transparent']/descendant::iframe")));
				d.findElement(By.name("username")).sendKeys("9713396661");
				d.findElement(By.name("password")).sendKeys("9926844365");
				d.findElement(By.cssSelector("span[class='ng-scope']")).click();
				WebDriverWait wait = new WebDriverWait(d, 120);
				if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='VQt2']"))).isDisplayed()) {
				String Text = d.findElement(By.xpath("//div[@class='_3ac-']")).getText();
				if(Text.contains("ADITYA"))
				{
					System.out.println("Test is passed.");
				}
				
				else
				{
					System.out.println("Test is failed.");
				}
			}
				else
				{
					System.out.println("Test is failed.");
				}
	}

}
