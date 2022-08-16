package selenium.weekotwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity {
	
	//navigate to https://tek-insurance.azurewebsites.net
	//Before entering username and password login button should be disabled. 
	//Check if the button is disabled. 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://tek-insurance.azurewebsites.net");
		driver.manage().window().maximize(); 
		

		
		WebElement loginBtnEl = driver.findElement(By.cssSelector("button#loginButton"));
		//to check if element is disable/enabled. method we are going to use is => isEnabled(); 
		boolean isBtnEnabled = loginBtnEl.isEnabled();
		System.out.println("Is Login button enabled. " + isBtnEnabled);
		if (!isBtnEnabled) {
			System.out.println("Test Passed button is disabled");
		}else {
			System.out.println("Test is Failed button is enabled which should not");
		}
		
		driver.quit();
	}

}

