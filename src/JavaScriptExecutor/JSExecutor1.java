package JavaScriptExecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class JSExecutor1 {

	public static void main(String[] args) throws InterruptedException {

		//Running headless browser
		ChromeOptions copt = new ChromeOptions();
		//copt.setHeadless(true);
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(copt);
		driver.get("http://opensource.demo.orangehrmlive.com");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		String title = (String)je.executeScript("return document.title");
		System.out.println(title);
		WebElement TxtBoxUserName = (WebElement)je.executeScript("return document.getElementById('txtUsername')");
				TxtBoxUserName.sendKeys("Admin");
		WebElement txtBoxPassword = driver.findElement(By.id("txtPassword"));
		je.executeScript("arguments[0].value='admin'", txtBoxPassword);
		je.executeScript("arguments[0].click()", driver.findElement(By.id("btnLogin")));
		Thread.sleep(6000);
		WebElement Admin = (WebElement)je.executeScript("return document.evaluate(\"//a[@id='menu_admin_viewAdminModule']\", document,null, XpathResult.FIRST_ORDERD_NODE_TYPE, null).singleNodeValue");
		Admin.click();
	}
}
