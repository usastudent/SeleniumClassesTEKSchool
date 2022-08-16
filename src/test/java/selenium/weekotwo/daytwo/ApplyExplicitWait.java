package selenium.weekotwo.daytwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplyExplicitWait {
	/*
	 * Explicit wait is synchronize wait in selenium 
	 * that will apply for each element you look for 
	 * specific Condition.
	 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		// maximize the window after navigation to application.
		driver.manage().window().maximize();
		//Apply Implicitly wait. 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Instantiate and object from WebdriverWait class and pass driver(WebDriver) and timeout in second
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//Explicit wait for condition
		WebElement usernameEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		usernameEl.sendKeys("supervisor");
		
		WebElement passwordEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		passwordEl.sendKeys("tek_supervisor");
		
		WebElement btnLoginEl = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("button#loginButton")));
		btnLoginEl.click();
		
		WebElement titleEl = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//span[contains(text(),'Tek Insurance App')]")));
		System.out.println(titleEl.getText());
		driver.quit();
	}

}

