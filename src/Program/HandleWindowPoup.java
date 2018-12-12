package Program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPoup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hariom/Desktop/appium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.linkText("Modeless Window")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator <String> Itr = handler.iterator(); // Use iterator to fetch values from set.
		String parentwin = Itr.next(); // itr.next pointing to parent window.
		System.out.println("parent window id is " + parentwin);
		
		String childwin = Itr.next();
		System.out.println("child window id is " + childwin);
		
		driver.switchTo().window(childwin);
		System.out.println("popup title is "  + driver.getTitle());
		driver.close(); // close the current window/pop up.
		
		driver.switchTo().window(parentwin);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
