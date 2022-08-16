package selenium.weekone.dayuthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		WebElement usernameEl = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div/div/input"));
		usernameEl.sendKeys("student");
		WebElement passwordEl = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div/div/input"));
		passwordEl.sendKeys("student");
		WebElement loginButton = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/button[1]"));
		loginButton.click();
		Thread.sleep(500);
		WebElement errorText = driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div"));
		String errorMessage= errorText.getText();
		if (errorMessage.equals ("USER_NOT_FOUND")){
		System.out.println("Test passed");
		}else{
		System.out.println("Test Failed");
		}
		driver.quit();
	}

}

