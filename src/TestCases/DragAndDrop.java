package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.theautomatedtester.co.uk/demo2.html");
		WebElement sourceElement = driver.findElement(By.xpath("/html/body/div[1]"));
		
		WebElement targetElement = driver.findElement(By.name("droppable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(sourceElement, targetElement).build().perform();
	}

}
