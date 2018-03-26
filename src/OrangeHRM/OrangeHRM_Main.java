package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Main {

	public static void main(String[] args) {
		
		OrangeHRM or = new OrangeHRM();
		SelAction se = new SelAction();
	//	String o = "CHECK";
	//	String p ="UNCHECK";
		String UserRole = "ESS";
		String UserName = "robert";
		String LeaveType = "Vacation US";
		By LeaveTypeLocatorId = By.id("assignleave_txtLeaveType");
		
		By ComboBoxObjInfo = By.name("searchSystemUser[userType]");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	if(or.Login_OrangeHRM(driver))
	{
		//driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();
		
		if(se.SelectComboBoxValue(driver, ComboBoxObjInfo, UserRole))
		{
			/*se.SelectAllCheckBox(driver, o);
			System.out.println("Checked the check box");
			se.SelectAllCheckBox(driver, p);
			System.out.println("Unchecked the check box");
			 */
			//se.SelectUserCheckBox(driver, UserName);
			//System.out.println("Selected the check box for user: " +UserName);
			se.SelectUserCheckBox_XpathAxes(driver, UserName);
			
		}
		
		action.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).moveToElement(driver.findElement(By.id("menu_leave_assignLeave"))).click().build().perform();
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("han");
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[6]/ul/li/strong"))).click().build().perform();
		if(se.SelectComboBoxValue(driver, LeaveTypeLocatorId, LeaveType))
		{
			
			action.moveToElement(driver.findElement(By.id("assignleave_txtFromDate"))).click().build().perform();
			System.out.println(se.getFutureDate());
		}
		}
	}
}
