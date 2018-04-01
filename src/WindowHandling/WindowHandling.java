package WindowHandling;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BasicComboBox.CommonClassForComboBox;
import CommonLibrary.MercuryTours;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException{
		
		MercuryTours mt = new MercuryTours();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("http://newtours.demoaut.com");
		//CommonClassForComboBox scmb = new CommonClassForComboBox();
		if(mt.Login_Mer(d1))
		{
			Thread.sleep(3000);
			String NewWindow = Keys.chord(Keys.SHIFT,Keys.RETURN);
			String NewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
			String TabSwitch = Keys.chord(Keys.CONTROL,Keys.TAB);
			d1.findElement(By.linkText("Hotels")).sendKeys(NewTab);
			Thread.sleep(1000);
			d1.findElement(By.linkText("Flights")).sendKeys(NewWindow);
			System.out.println("Tab Opened");
			Thread.sleep(4000);
			ArrayList<String>Win = new  ArrayList<>(d1.getWindowHandles());
			System.out.println(Win.size());
			d1.switchTo().window(Win.get(1));
			d1.get("https://facebook.com");
			System.out.println(d1.getTitle());
			d1.switchTo().window(Win.get(2));
			d1.get("https://www.yahoo.com");
			System.out.println(d1.getTitle());
			d1.close();
			d1.switchTo().window(Win.get(1));
			d1.close();
			d1.switchTo().window(Win.get(0));
			d1.close();
		}
		
	}

}
