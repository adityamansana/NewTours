package OrangeHRM;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelAction {

	public static void SelectAllCheckBox(WebDriver d, String option)
	{
		String CheckResult = d.findElement(By.id("ohrmList_chkSelectAll")).getAttribute("checked");
		if(CheckResult !=null)
		{
		if(option.equals("CHECK"))
		{
			System.out.println("Check Box already checked.");
		}
		
		else
		{
			d.findElement(By.id("ohrmList_chkSelectAll")).click();
		}
		}
		
		else
		{
			if(option.equals("CHECK"))
			{
				d.findElement(By.id("ohrmList_chkSelectAll")).click();
			}
			
			else
			{
				System.out.println("Check Box already checked.");
			}
		}
	}
	
	public boolean SelectComboBoxValue(WebDriver d, By ComboBoxObjInfo, String ValueToSelect) {
		Select cmd = new Select(d.findElement(ComboBoxObjInfo));
		cmd.selectByVisibleText(ValueToSelect);
		//System.out.println("Selected city is: " +ValueToSelect);
		return true;
	}
	
	public static void SelectUserCheckBox_XpathAxes(WebDriver d, String Name)
	{
		d.findElement(By.id("resultTable")).findElement(By.xpath("//tbody/descendant::a[text()='"+Name+"']/parent::*/parent::*/descendant::input")).click();
	}

	
	public static void SelectUserCheckBox(WebDriver d, String Name)
	{
		WebElement e = d.findElement(By.id("resultTable")).findElement(By.tagName("tbody"));
		List<WebElement>rows = e.findElements(By.tagName("tr")); 
		System.out.println(rows.size());
		for (WebElement row : rows)
		{
			List<WebElement>Cols = row.findElements(By.tagName("td"));
			System.out.println(Cols.size());
			System.out.println(row.getAttribute("class"));
			if(Cols.get(1).getText().equals(Name))
			{
				System.out.println(Cols.get(1).getText());
				System.out.println(Cols.get(0).findElement(By.tagName("input")).getAttribute("id"));
				Cols.get(0).findElement(By.tagName("input")).click();
				break;
			}
		}
	}
	
	public Calendar getFutureDate()
	{
	Calendar cal = Calendar.getInstance();
	System.out.println("current date: " + cal.getTime());
	cal.add(Calendar.DATE, 60);
	System.out.println("7 days later: " + cal.getTime());
	return cal;
	
	}
}
