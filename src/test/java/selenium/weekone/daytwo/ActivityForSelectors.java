package selenium.weekone.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActivityForSelectors {

	public static void main(String[] args) throws InterruptedException {
		 
		/*
		 * Activity 10 MIN
		 * Navigate to Facebook.com with Chrome browser.
		 * Enter user name and password and click on login.
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement usernameElement =driver.findElement(By.name("email"));
		usernameElement.sendKeys("Itisonlyforexamle");
		
		WebElement passwordElement =driver.findElement(By.id("pass"));
		passwordElement.sendKeys("itisonlyforexample");
		
		Thread.sleep(4000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		Thread.sleep(5000);
		
	}

}
