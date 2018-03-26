package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

		public boolean Login_OrangeHRM(WebDriver d) {

	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Softwares\\chromedriver.exe");
			
	//	WebDriver driver = new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		
		d.manage().window().maximize();
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");

		d.findElement(By.id("txtPassword")).sendKeys("admin");
		
		d.findElement(By.id("btnLogin")).click();
		
		return true;
		
		}	
}
