package CommonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepositiory.MercuryToursPageObjects;

public class MercuryTours {

	public boolean Login_Mer(WebDriver d)
	{
		try
		{
			d.findElement(MercuryToursPageObjects.txtBox_Username).sendKeys("mercury");
			d.findElement(MercuryToursPageObjects.txtBoxPassword).sendKeys("mercury");
			d.findElement(MercuryToursPageObjects.btn_Signin).click();
			Thread.sleep(3000);
			System.out.println("Passed: Login successfull");
			return true;
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	private boolean CheckRadiobtn(WebDriver d, By RadioBtnObjInfo)
	{
		try
		{
			d.findElement(RadioBtnObjInfo).click();
			return true;
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean RadioBtnSelection(WebDriver d, String Option)
	{
		By rdBtnInfo = null;
		try
		{
			switch (Option.toUpperCase()) {
			case "ONEWAY":
				rdBtnInfo = MercuryToursPageObjects.rdBtn_oneway;
				break;
			case "ROUNDTRIP":
				rdBtnInfo = MercuryToursPageObjects.rdBtn_Roundtrip;
				break;
			case "BUSSINESS":
				rdBtnInfo = MercuryToursPageObjects.rdBtn_BusinessClass;
				break;
			case "ECONOMY":
				rdBtnInfo = MercuryToursPageObjects.rdBtn_EconomyClass;
				break;
			case "FIRST CLASS":
				rdBtnInfo = MercuryToursPageObjects.rdBtn_FirstClass;
				break;
			}
		CheckRadiobtn(d,rdBtnInfo);
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println("Radio Button not got clicked.");
			System.out.println(e.getMessage());
			return false;
		}
	}
}
