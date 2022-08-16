package selenium.weekone.daytwo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSeleniumDayTwo {

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	String title = driver.getTitle();	
	System.out.println(title);
	driver.quit();
}
}