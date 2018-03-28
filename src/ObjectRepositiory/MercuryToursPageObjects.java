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
	public static By txtFromDate = By.id("assignleave_txtFromDate");
	public static By caption_Text = By.xpath("//form[@name=\"results\"]/descendant::b[contains(text(),'Price')][4]");
	public static By btnCalanderNext = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	public static By txtToDate = By.id("assignleave_txtToDate");
	public static By btnSelectFromDate = By.xpath("//a[contains(text(),'11')]");
	public static By btnSelectToDate = By.xpath("//a[contains(text(),'15')]");
	public static By btnAssignLeave = By.id("assignBtn");
	public static By txtSearchEmployeeByName = By.id("assignleave_txtEmployee_empName");
	public static By btnLeaveOnMainMenu = By.id("menu_leave_viewLeaveModule");
	public static By btnLeaveSubMenu = By.id("menu_leave_assignLeave");
	public static By btnLeaveReports = By.id("menu_leave_Reports");
	public static By btnLeaveBalanceReport = By.id("menu_leave_viewLeaveBalanceReport");
	public static By cmbBox_SelectLeaveSearchType = By.id("leave_balance_report_type");
	
	public static By txtLeave_EmployeeName = By.id("leave_balance_employee_empName");
	public static By txtEmployeeNametoSearchLeave = By.xpath("//strong[contains(text(),'Han')]");
	public static By btnAssignLeaveConfirmation = By.id("confirmOkButton");
	public static By btnViewLeave = By.id("viewBtn");
	
	//form[@name="results"]/descendant::b[contains(text(),'Price')][4]/parent::*/parent::*/parent::*/parent::*/preceeding-sibling::*
	//form[@name="results"]/descendant::b[contains(text(),'Price')][4]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::tr/child::*/input
}
