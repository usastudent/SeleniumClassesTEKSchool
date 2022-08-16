package selenium.weekone.dayuthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework {
	
	// Selectors: id, name, class name, tag  name, linkText, partial Link Text, xpath, css
	
	public static void main(String[] args) throws InterruptedException {
		// login to https:tek-Insurance.azurewebsites.net/ with valid user name and password
		// validate you logged in.
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:tek-Insurance.azurewebsites.net");
		
		WebElement usernameElement =driver.findElement(By.name("username"));
		usernameElement.sendKeys("supervisor");

		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("tek_supervisor");
		
		WebElement loginButtonElement = driver.findElement(By.id("loginButton"));
		loginButtonElement.click();
		
		Thread.sleep(2000);
		
		// By.xpath => will use full xpath
		WebElement titleElement =driver.findElement(By.xpath
				("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/span[1]"));
	String title = titleElement.getText();
	
	if (title.equals("Tek Insurance App")) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Title not matched with expected");
	}
		driver.quit();
		
		
	}

}
