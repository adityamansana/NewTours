package TestChromeOptions;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCrOptions {

	public static void main(String[] args) {

		ChromeOptions copt = new ChromeOptions();
		//Setting chrome options.
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
		copt.addExtensions(new File("C:\\Selenium Softwares\\Momentum_v0.101.1.crx"));
		copt.addExtensions(new File("C:\\Selenium Softwares\\Evernote-Web-Clipper_v7.0.1.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(copt);
		driver.get("http://opensource.demo.orangehrmlive.com");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement TxtBoxUserName = (WebElement)je.executeScript("return document.getElementById('txtUsername')");
		TxtBoxUserName.sendKeys("Admin");
		System.out.println("Browser launched and website opened successfully.");
		//Desired Capabilities
	}

}
