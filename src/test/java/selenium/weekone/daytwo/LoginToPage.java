package selenium.weekone.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToPage {
	
	/*
	 * Login to web page
	 */
	
	/*
	 * Username : supervisor
	 * Password : tek_supervisor
	 */
	/*
	 * Selectors in selenium:
	 *  id, name, class name, tag name, linkText, partial Link Text, xpath, ccs
	 *  
	 *  By: is a class
	 *  By.name();
	 *  By.xpad();
	 *  By.id();
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://tek-insurance.azurewebsites.net");
		
		//findElement => to find Elements, By => to choose Selector
		WebElement usernameElement =driver.findElement(By.name("username"));
		// with this Method we can pass values to Input elements.
		usernameElement.sendKeys("supervisor");
		
		WebElement paswordElement = driver.findElement(By.name("password"));
		paswordElement.sendKeys("tek_supervisor");
		
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//this method to perform click on any element that is click able;
		loginButton.click();
		
		Thread.sleep(10000);
		
		

	}

}
