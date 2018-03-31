package FreightManagement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fois.indianrail.gov.in/FoisWebsite/html/fois_home.htm");
		if(driver.findElement(By.id("HOME_LEFT_BOTTOM")).isDisplayed())
		{
		driver.switchTo().frame(driver.findElement(By.id("HOME_LEFT_BOTTOM")));
		driver.findElement(By.xpath("//a[contains(text(),'RMS Queries')]")).click();
		//switching to the default of first tab
		driver.switchTo().defaultContent();
		}
	}
}