package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hariom/Desktop/appium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // delete all cookies
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver); // mouse movement will be done by action class.
		String str = driver.findElement(By.id("highlight-addons")).getText();
		System.out.println(str);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Priority Check-in")).click();
		
		
	}

}
