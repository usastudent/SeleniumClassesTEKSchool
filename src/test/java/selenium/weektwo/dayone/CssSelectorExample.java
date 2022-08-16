package selenium.weektwo.dayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorExample {
	
	/*
	 * Css Examples. 
	 * 
	 * finding css using class names =>  tag.classname
	 *    input.mat-input-element
	 *    > step by step between elements. 
	 *    space between tag it will jump to the target element.
	 *  2) form > mat-form-field > div > div input[name='password']
	 *  
	 */
	
	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://tek-insurance.azurewebsites.net");
		
		//maximize browser window
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//css example : tag[attribute = 'value']
		WebElement usernameEl= driver.findElement(By.cssSelector("input[name='username']"));
		usernameEl.sendKeys("supervisor");
		WebElement passwordEl = driver.findElement(
				By.cssSelector("input[name='password']"));
		passwordEl.sendKeys("tek_supervisor");
		// css selector: if you have unique id for element use #id-value
		WebElement loginButton = driver.findElement(By.cssSelector("#loginButton"));
		loginButton.click(); 
		
		Thread.sleep(5000);
		//driver.close(); 
		
		// Break for 20 min . till 8:00 PM PST , 11:00 PM EST. 
	}

}

