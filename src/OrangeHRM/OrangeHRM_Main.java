package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepositiory.MercuryToursPageObjects;

public class OrangeHRM_Main {

	public static void main(String[] args) throws InterruptedException {
		
		OrangeHRM or = new OrangeHRM();
		SelAction se = new SelAction();
		MercuryToursPageObjects po = new MercuryToursPageObjects();
	//	String o = "CHECK";
	//	String p ="UNCHECK";
		String UserRole = "ESS";
		String UserName = "fg0004";
		String LeaveType = "Vacation US";
		By LeaveTypeLocatorId = By.id("assignleave_txtLeaveType");
		String SearchLeaveType = "Employee";
		
		By ComboBoxObjInfo = By.name("searchSystemUser[userType]");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	if(or.Login_OrangeHRM(driver))
	{
		//driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();
		
   /*		if(se.SelectComboBoxValue(driver, ComboBoxObjInfo, UserRole))
		{
		//	se.SelectAllCheckBox(driver, o);
		//	System.out.println("Checked the check box");
		//	se.SelectAllCheckBox(driver, p);
		//	System.out.println("Unchecked the check box");
			 
			//se.SelectUserCheckBox(driver, UserName);
			//System.out.println("Selected the check box for user: " +UserName);
			se.SelectUserCheckBox_XpathAxes(driver, UserName);
			
		}   */
		
		action.moveToElement(driver.findElement(po.btnLeaveOnMainMenu)).moveToElement(driver.findElement(po.btnLeaveSubMenu)).click().build().perform();
		driver.findElement(po.txtSearchEmployeeByName).sendKeys("han");
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[6]/ul/li/strong"))).click().build().perform();
		if(se.SelectComboBoxValue(driver, LeaveTypeLocatorId, LeaveType))
		{
			
			action.moveToElement(driver.findElement(po.txtFromDate)).click().build().perform();
			action.moveToElement(driver.findElement(po.btnCalanderNext)).click().build().perform();
			action.moveToElement(driver.findElement(po.btnSelectFromDate)).click().build().perform();
			//Thread.sleep(5000);
			action.moveToElement(driver.findElement(po.txtToDate)).click().build().perform();
			action.moveToElement(driver.findElement(po.btnCalanderNext)).click().build().perform();
			action.moveToElement(driver.findElement(po.btnSelectToDate)).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(po.btnAssignLeave).click();
			Thread.sleep(2000);
			driver.findElement(po.btnAssignLeaveConfirmation).click();
			action.moveToElement(driver.findElement(po.btnLeaveReports)).click().build().perform();
			action.moveToElement(driver.findElement(po.btnLeaveBalanceReport)).click().build().perform();
			if(se.SelectComboBoxValue(driver, po.cmbBox_SelectLeaveSearchType, SearchLeaveType))
			{	
			driver.findElement(po.txtLeave_EmployeeName).sendKeys("han");
			action.moveToElement(driver.findElement(po.txtEmployeeNametoSearchLeave)).click().build().perform();
			driver.findElement(po.btnViewLeave).click();
			}
		}
		}
	}
}
