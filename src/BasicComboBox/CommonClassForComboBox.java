package BasicComboBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonClassForComboBox {

	public boolean SelectComboBoxValue(WebDriver d, By ComboBoxObjInfo, String ValueToSelect) {
		Select cmd = new Select(d.findElement(ComboBoxObjInfo));
		cmd.selectByVisibleText(ValueToSelect);
		System.out.println("Selected city is: " +ValueToSelect);
		return true;
	}


	
}
