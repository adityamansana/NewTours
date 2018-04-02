package TestNaukri;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestNaukri {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Robot r = new Robot();
		ChromeOptions copt = new ChromeOptions();
		//Setting chrome options.
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(copt);
		driver.get("https://www.naukri.com/");
		System.out.println("Browser launched and website opened successfully.");
		driver.findElement(By.id("input_resumeParser")).click();
		System.out.println("Clicked on browse button");
		
		Screen s = new Screen();
	    Pattern p = new Pattern("C:\\Selenium Training\\Sikuli Images\\FileName.png");
	    s.click(p);
	    Pattern p1 = new Pattern("C:\\Selenium Training\\Sikuli Images\\OpenButton.png");
	    s.click(p1);
		if(s.exists(p1) != null)
		{
			s.type(p1, "C:\\Selenium Training\\FileUpload\\Aditya_Mansana_CV.doc");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_C);
		}
	}

}
