package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());

	}

}
