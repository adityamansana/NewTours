package TestCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestClass1 {



	public static void main(String[] args) throws InterruptedException {

		String airlineName = "Unified";

		String outboundflightPriceLocator = "//input[@name='outFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b";

		String inboundflightPriceLocator ="//input[@name='inFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b";

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");

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

//*********************OutBound FLight*********************//

		element=driver.findElements(By.xpath(outboundflightPriceLocator));

		ArrayList<Integer> list = new ArrayList<>();

		for(WebElement s:element){

			Integer s1=Integer.parseInt(TrimText(s.getText()));

		   list.add(s1);

		}
		Collections.sort(list);

		int p = list.get(list.size() - 1);

		System.out.println("Outbound Flight Price: "+p);

//*********************InBound FLight*********************//

	 element=driver.findElements(By.xpath(inboundflightPriceLocator));

			ArrayList<Integer> list1 = new ArrayList<>();

			for(WebElement s:element){

				Integer s1=Integer.parseInt(TrimText(s.getText()));

			   list1.add(s1);

			}

			Collections.sort(list);

			int q = list1.get(list1.size() - 1);

 		    System.out.println("Inbound Flight Price: "+q);

			   // Need to work on to get the radio button select using xpath

 //		String OutFlightPriceXpath = "//input[@name='outFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b[contains(text(),'270')]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::tr/td/input";

 //		driver.findElement(By.xpath(OutFlightPriceXpath)).click();

 //		System.out.println("Clicked outbound flight's radio button");

//   	String InboundFlightXpath = "//input[@name='inFlight']/parent::*/parent::*/following-sibling::tr/td[@class='data_verb_xcols']/child::font/font/b[contains(text(),'"+q+"')]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::tr/td/input";

// 		driver.findElement(By.xpath(InboundFlightXpath)).click();

// 		System.out.println("Clicked Inbound flight's radio button");

// 		String xpathToGetTheAirlinesName = "//b[contains(text(),'"+p+"')]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::*/child::*/child::*/child::b";

 		String xpathToSelectRadioButton ="//b[contains(text(),'"+p+"')]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::*/descendant::b[contains(text(),'"+airlineName+"')]/parent::*/parent::*/parent::*/descendant::input";

 		driver.findElement(By.xpath(xpathToSelectRadioButton)).click();
 		
 		xpathToSelectRadioButton ="//b[contains(text(),'"+q+"')]/parent::*/parent::*/parent::*/parent::*/preceding-sibling::*/descendant::b[contains(text(),'"+airlineName+"')]/parent::*/parent::*/parent::*/descendant::input";

 		driver.findElement(By.xpath(xpathToSelectRadioButton)).click();
 		
 		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
 		
 		Integer tax= Integer.parseInt(TrimText(driver.findElement(By.xpath("//font[contains(text(),'Taxes')]/parent::*/following-sibling::*/font")).getText()));
 		
 		System.out.println("Tax is: "+tax);
 		
 		Integer TotalPrice = p+q+tax;
 		
 		System.out.println("Total Price "+TotalPrice);
 		
 		Integer PriceonWebsite = Integer.parseInt(TrimText(driver.findElement(By.xpath("//font[contains(text(),'Tot')]/parent::*/following-sibling::*/font")).getText()));
 		
 		System.out.println("Price on website "+PriceonWebsite);
 		
 		if(PriceonWebsite.equals(TotalPrice))
 		{
 			System.out.println("Price Matched.");
 		}
 		
 		else
 		{
 			System.out.println("Price do not Matched.");
 		}

 		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
 		
// 		Integer PNR = Integer.parseInt(TrimText(driver.findElement(By.xpath("//font[contains(text(),'Confirmation')]")).getText()));
 		
		//--------------getText--------------//
 		
		if(driver.findElement(By.xpath("//font[contains(text(),'Your')]")).getText().equals("Your itinerary has been booked!"))
		{

			System.out.println("Flight successfully booked. Your PNR is: " +(TrimText(driver.findElement(By.xpath("//font[contains(text(),'Confirmation')]")).getText())));
		
		}
		
		else
		{
			System.out.println("Flight booking failed!");
		}
		
	}

		   public static String TrimText(String args){

		    	String something = args;

		    	int length = something.length();

		    String result = "";

		    for (int i = 0; i < length; i++) {

		        Character character = something.charAt(i);

		        if (Character.isDigit(character) ) {

		            result += character;
		    
		        }

		    }

		    return result;

//		    System.out.println("result is: " + result);

		     }

}