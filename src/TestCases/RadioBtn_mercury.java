package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonLibrary.MercuryTours;

public class RadioBtn_mercury {

	public static void main(String[] args) throws InterruptedException {

		MercuryTours mt = new MercuryTours();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Softwares\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		if(mt.Login_Mer(driver))
		{
			if(mt.RadioBtnSelection(driver, "ROUNDTRIP"))
			{
				if(mt.RadioBtnSelection(driver, "bussiness"));
				{
					System.out.println("Passed: test case is passed");
				}
			}
		}
		driver.close();
	}

}
