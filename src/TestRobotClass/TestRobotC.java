package TestRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRobotC {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions copt = new ChromeOptions();
		//Setting chrome options.
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(copt);
		
		Robot r = new Robot();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		//Control T is now pressed.
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://facebook.com");
		driver.close();
		driver.close();
	}

}
