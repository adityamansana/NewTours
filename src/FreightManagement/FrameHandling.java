package FreightManagement;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//Running headless browser
		ChromeOptions copt = new ChromeOptions();
		//copt.setHeadless(true);
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(copt);
		driver.get("http://www.fois.indianrail.gov.in/FoisWebsite/html/fois_home.htm");
		if(driver.findElement(By.id("HOME_LEFT_BOTTOM")).isDisplayed())
		{
		driver.switchTo().frame(driver.findElement(By.id("HOME_LEFT_BOTTOM")));
		driver.findElement(By.xpath("//a[contains(text(),'RMS Queries')]")).click();
		ArrayList<String> Windows = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Windows.size());
		driver.switchTo().window(Windows.get(1));
		System.out.println("Switched Tab");
		//switch ti frame
		driver.switchTo().frame(driver.findElement(By.id("frmApplLgin")));
		
		driver.findElement(By.id("txtUserId")).sendKeys("test");
		driver.findElement(By.id("txtPassword")).sendKeys("test");
		driver.findElement(By.id("txtOptnS")).click();
		driver.findElement(By.id("txtLocation")).sendKeys("Pune");
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(3000);
		driver.close();
		//switching to the default of first tab
		driver.switchTo().defaultContent();
		}
	}
}