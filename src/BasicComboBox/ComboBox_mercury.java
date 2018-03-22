package BasicComboBox;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonLibrary.MercuryTours;
import ObjectRepositiory.MercuryToursPageObjects;

public class ComboBox_mercury {

	public static void main(String[] args) throws InterruptedException {

		MercuryTours mt = new MercuryTours();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Softwares\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		CommonClassForComboBox scmb = new CommonClassForComboBox();
		if(mt.Login_Mer(driver))
		{
			scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_DepartingFrom, "Frankfurt");
			scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_ArrivingTo, "London");
		}
		driver.close();
	}

}