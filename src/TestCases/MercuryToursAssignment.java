package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicComboBox.CommonClassForComboBox;
import CommonLibrary.MercuryTours;
import ObjectRepositiory.MercuryToursPageObjects;

public class MercuryToursAssignment {
	public static void main(String[] args) throws InterruptedException {

		MercuryTours mt = new MercuryTours();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Softwares\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		CommonClassForComboBox scmb = new CommonClassForComboBox();
		if(mt.Login_Mer(driver))
		{
			if(mt.RadioBtnSelection(driver, "ROUNDTRIP"))
			{
				if(mt.RadioBtnSelection(driver, "bussiness"));
				{
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_Passengers, "1");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_DepartingFrom, "Frankfurt");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_OutMonth, "April");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_OutDate, "18");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_ArrivingTo, "London");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_InMonth, "May");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_InDate, "18");
					scmb.SelectComboBoxValue(driver, MercuryToursPageObjects.cmbBox_Airline, "Unified Airlines");
					driver.findElement(MercuryToursPageObjects.btn_Continue).click();
					
					
				}
			}
		}
		//driver.close();
	}
}
