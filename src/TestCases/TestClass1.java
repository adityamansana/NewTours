package TestCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {

		//String outboundflightprice = "//td[@class='data_verb_xcols']/descendant::b/parent::*/parent::*/parent::*/parent::*/parent::*/descendant::input[@name='outFlight']";
		//String inboundflightprice ="//td[@class='data_verb_xcols']/descendant::b/parent::*/parent::*/parent::*/parent::*/parent::*/descendant::input[@name='inFlight']";
		//int[] price = new int[10];
		String outboundflightLocator = "//input[@name='outFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b";
		String inboundflightLocator ="//input[@name='inFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	
		List<WebElement> element;
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		System.out.println("Logged in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Clicked on btn");
		//element=driver.findElements(By.xpath("//td[@class='data_verb_xcols']/descendant::b"));
		element=driver.findElements(By.xpath(outboundflightLocator));
		ArrayList<Integer> list = new ArrayList<>();
		for(WebElement s:element){
			//System.out.println(s.getText());
			Integer s1=Integer.parseInt(TrimText(s.getText()));
		  //  System.out.println(s1);
		   list.add(s1);
		}
		Collections.sort(list);
		int p = list.get(list.size() - 1);
		   System.out.println("Outbound Flight Price: "+p);
	
		   element=driver.findElements(By.xpath(inboundflightLocator));
			ArrayList<Integer> list1 = new ArrayList<>();
			for(WebElement s:element){
				//System.out.println(s.getText());
				Integer s1=Integer.parseInt(TrimText(s.getText()));
			  //  System.out.println(s1);
			   list1.add(s1);
			}
			Collections.sort(list);
			int q = list1.get(list1.size() - 1);
			   System.out.println("Inbound Flight Price: "+q);
	
			   // Need to work on to get the radio button select using xpath
			   ////font[contains(@color, '333333')]/child::*
	}
	
		   
		   
		   public static String TrimText(String args){
		        //System.out.println(Integer.parseInt("Price: $270"));
		          //String something = "Price: $270";
		    	String something = args;
		    	int length = something.length();
		    String result = "";
		    for (int i = 0; i < length; i++) {
		        Character character = something.charAt(i);
		        if (Character.isDigit(character)) {
		            result += character;
		        }
		    }
		    return result;
//		    System.out.println("result is: " + result);
		     }
}


