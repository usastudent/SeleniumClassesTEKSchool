package slenium.weekone.labseesion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://tek-insurance.azurewebsites.net");

		WebElement userElement = driver.findElement(By.xpath("//input[@type = 'text']"));

		userElement.sendKeys("supervisor");

		WebElement passElement = driver.findElement(By.xpath("//input[@name = 'password']"));

		passElement.sendKeys("tek_supervisor");

		WebElement loginBtnElement = driver.findElement(By.xpath("//button[@type = 'submit']"));

		loginBtnElement.click();

		Thread.sleep(3000);

		WebElement titleEl = driver.findElement(By.xpath("//span[contains(text(), 'Tek Insurance App')]"));

		String name = titleEl.getText();

		System.out.println(name);

		WebElement iconElement = driver.findElement(By.xpath("//button[contains(@class,'mat-menu-trigger')]"));

		iconElement.click();

		Thread.sleep(2000);

		WebElement logoutElement =driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[2]"));

		logoutElement.click();

		Thread.sleep(3000);

		driver.quit();
	}

}
