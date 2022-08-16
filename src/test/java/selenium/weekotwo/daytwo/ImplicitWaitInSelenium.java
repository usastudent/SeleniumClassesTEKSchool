package selenium.weekotwo.daytwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		// Synchronize Wait in Selenium.
		// implicit wait and explicit wait.

		// implicit wait is a global wait that you apply to driver.
		// How to implement.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		// maximize the window after navigation to application.
		driver.manage().window().maximize();
		// implement implicit wait to driver.
		// arguments => time you want to wait (number), TimeUnit .
		// this call global wait.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement nameElement = driver.findElement(By.xpath("//input[@name='username']"));
		nameElement.sendKeys("supervisor");
		WebElement passElement = driver.findElement(By.xpath("//input[@name='password']"));
		passElement.sendKeys("tek_supervisor");
		WebElement logButElement = driver.findElement(By.xpath("//button[@type='submit']"));
		logButElement.click();
		
		WebElement appTitle = driver.findElement(By.xpath("//span[contains(text(),'Tek Insurance App')]"));
		System.out.println(appTitle.getText());	
		driver.quit();
		
	}

}

