package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hariom/Desktop/appium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://realestate.com.au");
		
		driver.navigate().to("http://amazon.com");
		
		driver.navigate().back(); // back to realestate.com.au
		
		Thread.sleep(3000);
		
		driver.navigate().forward(); // back to amazon.com
		
		driver.navigate().refresh(); // refresh the page
		
		
		
		
		
		
		

	}

}
