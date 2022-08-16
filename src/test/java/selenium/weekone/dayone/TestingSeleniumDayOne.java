package selenium.weekone.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSeleniumDayOne {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup Chrome browser to use.
		WebDriverManager.chromedriver().setup();
		
		// Instantiate New Object of ChromeDriver to use Chrome.
		ChromeDriver driver = new ChromeDriver();
		
		// Open browser and navigate url.
		driver.get("https://www.google.com");
		
		//We use this function only to pause the browser for a practice.
		Thread.sleep(5000);
		
		// Close the browser
		driver.quit();
		

	}

}
