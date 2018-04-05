package TestAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class AmazonAssignment {

		/*Objective
		 * GO to amazon  and search for any project and check for 
		 * a certain text on all the search result elements.
		 * also write 10 test cases for automation framework 
		 */
	public static void main(String[] args) throws ElementNotFoundException, ElementNotVisibleException, Exception {
		
		//	By ULXpath = By.xpath("//ul[@id='s-results-list-atf']");
			
			ChromeOptions copt = new ChromeOptions();
			
			//Setting chrome options.
			//copt.addArguments("start-maximized");
			copt.addArguments("disable-infobars");
			//copt.setHeadless(true);
			copt.addArguments("headless");
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(copt);
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("amazon prime video");
			driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input")).click();
			
			//ArrayList<WebElement> SearchResult = new ArrayList<WebElement>();
			/*for(int i=0; i< 5; i++)
			{
			driver.findElement(By.id("result_"+i+""));
			
			}*/
			WebElement e;
			int iterateTill = Integer.parseInt(driver.findElement(By.xpath("//span[@class='pagnDisabled']")).getText());
			System.out.println("Total number of search result pages are: " +iterateTill);
			try{
			for(int i=1;i<=iterateTill;i++)
			{
				/*if((driver.findElement(By.xpath("//span[@class='pagnRA1']")).isDisplayed()))
				{*/
			e = driver.findElement(By.id("s-results-list-atf"));
			List<WebElement>rows = e.findElements(By.xpath("//li[@class='s-result-item celwidget  ']")); 
			System.out.println("For loop - Number of Rows "+rows.size());
			for (WebElement row : rows)
			{
				List<WebElement>Title = row.findElements(By.tagName("h2"));
				System.out.println("FOr each loop - Title Size = " +Title.size());
				System.out.println("Title = " +Title);
				//System.out.println(row.getAttribute("class"));
					System.out.println(Title.get(0).getText());
					//System.out.println(Title.get(0).findElement(By.tagName("input")).getAttribute("id"));
					//Title.get(0).findElement(By.tagName("input")).click();
					//Title.get(0).findElement(By.linkText("amazon").toString().contains("amazon");
					//break;
			}
			System.out.println("Moved to the search result page number" +i);
			//driver.findElement(By.xpath("//div[@id='pagn']/descendant::*/a[.='"+(i+1)+"']")).click();
			System.out.println("Clicked on "+(i+1));
			//}
			/*	else
				{
					System.out.println("reached at the end of the search page.");
				}*/
			}
			
			}
			
			catch(Exception x)
			{
			System.out.println(x.getMessage());
			}
		}
}
