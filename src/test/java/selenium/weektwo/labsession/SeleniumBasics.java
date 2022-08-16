package selenium.weektwo.labsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		// System.setProperty : was used in the past and equall so to WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.driver.chrome", "path for driver.exe file");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail");// this method opens the browser
		driver.navigate().to("https://www.google.com/");// 
		
		driver.manage().window().maximize(); // this will open browser in full screen
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// this is global wait and it applies to entire execution.
		// it says wait for 30seconds and if it doesn't execute it during 30s then throws and-
		// -exception and if execute it during 30 secodns so continue it
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// sometimes when you open a browser it may take some more seconds because of-
		// bad network connection or ... so by this methods we wait for a certain amount of -
		// time before throwing exception 
		driver.manage().deleteAllCookies(); // chshe and cookies are the history of our-
		//- websearching
		driver.findElement(null); // this method finds one element - NoSuchElement Exception- Return WebElement
		driver.findElements(null); // this method finds all elements that share common tag or locators - Return empty list - Lis<WebElement>
		driver.getTitle(); // this returns title of webpage - String
		driver.close(); // this will close current tab opened by Webdriver. 
		driver.quit(); // this will close all opened tab by webdriver
		
	}

}

