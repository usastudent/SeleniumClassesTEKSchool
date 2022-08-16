package selenium.weekotwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeFromJawid {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-insurance.azurewebsites.net");
        driver.manage().window().maximize();
        WebElement nameElement = driver.findElement(By.xpath("//input[@name='username']"));
         nameElement.sendKeys("supervisor");
        WebElement passElement = driver.findElement(By. xpath("//input[@name='password']"));
        passElement.sendKeys("tek_supervisor");
        WebElement logButElement = driver.findElement(By.xpath("//button[@type='submit']"));
        logButElement.click();
        Thread.sleep(1000);
        WebElement menuElement = driver.findElement(By.xpath("//mat-toolbar//button[1]"));
        menuElement.click();
        Thread.sleep(1000);
        WebElement accMenuEl =  driver.findElement(By.partialLinkText("Accounts")); 
        accMenuEl.click();
        Thread.sleep(2000);
        driver.quit();
		
	}

}
