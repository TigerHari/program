package Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	
	//html driver testing - 1. testing behind the scenes, no browser launch
	//2. testing very fast, improve the performance of the script.
	//3. not suitable for actions, mouse movements, doubleclick, drag and drop.
	// html browser is called ghost driver, headless driver.
	//Htmldriver - java
	//phantomJS - JS

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // delete all cookies
		
		driver.get("https://www.ebay.com/");
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for (int i = 0; i< linklist.size(); i++)
		{
			System.out.println(linklist.get(i).getText());
		}
		
		
		driver.quit();
		

	}
	}


