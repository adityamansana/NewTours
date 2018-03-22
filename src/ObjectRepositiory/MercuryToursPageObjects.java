package ObjectRepositiory;

import org.openqa.selenium.By;

public class MercuryToursPageObjects {

	public static By txtBox_Username = By.name("userName");
	public static By txtBoxPassword = By.name("password");
	public static By btn_Signin = By.cssSelector("input[value='Login']");
	public static By rdBtn_oneway = By.cssSelector("input[value='oneway']");
	public static By rdBtn_Roundtrip = By.cssSelector("input[value='roundtrip']");
	public static By rdBtn_BusinessClass = By.cssSelector("input[value='Business']");
	public static By rdBtn_FirstClass = By.cssSelector("input[value='First']");
	public static By rdBtn_EconomyClass  =By.cssSelector("input[value='Coach']");
	public static By cmbBox_DepartingFrom  = By.cssSelector("select[name='fromPort']");
	public static By cmbBox_ArrivingTo  = By.cssSelector("select[name='toPort']");
	public static By cmbBox_Passengers  = By.cssSelector("select[name='passCount']");
	public static By cmbBox_OutMonth  = By.cssSelector("select[name='fromMonth']");
	public static By cmbBox_OutDate  = By.cssSelector("select[name='fromDay']");
	public static By cmbBox_InMonth  = By.cssSelector("select[name='toMonth']");
	public static By cmbBox_InDate  = By.cssSelector("select[name='toDay']");
	public static By cmbBox_Airline  = By.cssSelector("select[name='airline']");
	public static By btn_Continue = By.cssSelector("input[name='findFlights']");
	
	public static By caption_Text = By.xpath("//form[@name=\"results\"]/descendant::b[contains(text(),'Price')][4]");
	
	//form[@name="results"]/descendant::b[contains(text(),'Price')][4]/parent::*/parent::*/parent::*/parent::*/preceeding-sibling::*
	//form[@name="results"]/descendant::b[contains(text(),'Price')][4]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::tr/child::*/input
}
