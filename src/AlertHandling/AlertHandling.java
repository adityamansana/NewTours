package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Aditya\\Downloads\\Test.html");
		driver.findElement(By.cssSelector("button[id='btnTryit']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='btnTryit']")).click();
		Thread.sleep(2000);
		a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		Thread.sleep(2000);
		driver.close();
	}

}
