package selenium.weekone.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorByClassName {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Here we trying to login with invalid user name
		 * and check the error message.
		 */
		
		// set up 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://tek-insurance.azurewebsites.net");
		
		
		WebElement usernameElement =driver.findElement(By.name("username"));
		usernameElement.sendKeys("supervisor");
		
		WebElement passwordElement =driver.findElement(By.name("password"));
		passwordElement.sendKeys("operator");
		
		Thread.sleep(4000);
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		Thread.sleep(2000); // == 2 second and its for pause execuation of java code
		// get error message.
		
		WebElement errorMessageElement =driver.findElement(By.className("error"));
		
		//isDisplay : returns if the element is displayed or not in the web page.
		boolean isElementDisplayed = errorMessageElement.isDisplayed();
		System.out.println(isElementDisplayed);
		
//		String errorText = errorMessageElement.getText();
//		System.out.println(errorText);
		
		if(isElementDisplayed) {
			System.out.println("Test Is Passed");
		}else {
			System.out.println("Test failed because error banner didn't show up");
		}
		
		driver.quit();

	}

}
