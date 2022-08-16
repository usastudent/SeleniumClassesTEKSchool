package selenium.weekone.dayuthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity {

	public static void main(String[] args) throws InterruptedException {
		
		// login with user name : student, password: student, and click login
		// Error will apear get text of error and print it in console.
		// use absolute xpath.
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		
		WebElement usernameElement = driver.findElement(By.xpath("/html/body/app-root/app-login"
		+ "/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div[3]/input"));
		usernameElement.sendKeys("student");
		
		WebElement passwordElement = driver.findElement(By.xpath("/html/body/app-root/app-login/"
		+ "div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[3]/input"));
		passwordElement.sendKeys("Student");
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/app-root/app-login/"
		+ "div/mat-card/mat-card-content/form/button[1]"));
		loginButton.click();
		
		Thread.sleep(3000); // it solve the NoSuchElementException here 
		
		WebElement errorText = driver.findElement(By.xpath("/html/body/app-root/app-login/div/"
		+ "mat-card/mat-card-content/app-banner/div"));
		String errorMessage = errorText.getText();
		
		if(errorMessage.equals("USER_NOT_FOUND")) {
			System.out.println("test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.quit();
		
		
		
		
		
		
		

	}

}
