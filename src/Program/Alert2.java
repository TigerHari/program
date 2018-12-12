package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hariom/Desktop/appium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		org.openqa.selenium.Alert pop = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(pop.getText());
		
		pop.accept(); // for Ok button.
		//pop.dismiss(); // for cancel button.
	
		
		driver.quit();		

	}

}
