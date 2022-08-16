package selenium.weektwo.daythree;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
	public static ChromeDriver driver; 
	
	public void setupDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void quiteBrowser() {
		driver.quit();
	}
	
	public void sendTextToField(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element.sendKeys(text);
	}
	
	public void clicking(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public void getElementText(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		String text  = element.getText();
		System.out.println(text);
	}

}
