package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hariom/Desktop/appium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		//*[@id="07/11/2018"]
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.id("monthWrapper"));
		js.executeScript("window.scrollBy(0,2000)");
		
		
		

	}

}
