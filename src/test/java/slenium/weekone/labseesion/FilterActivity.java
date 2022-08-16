package slenium.weekone.labseesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterActivity {

	// navigate to tek-insurance app and login.
	// go to accounts page.
	// and filter
	// send a value to filter.

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
		Thread.sleep(1000);
		//
		WebElement menuElement = driver.findElement(By.xpath("//mat-toolbar//button[1]"));
		menuElement.click();
		Thread.sleep(500);
		WebElement accountMenuElement = driver.findElement(By.xpath("//a[contains(@class,'nav-item')]"));
		accountMenuElement.click();
		Thread.sleep(1000);
		WebElement sectionTitle = driver.findElement(By.xpath("//mat-card/mat-card-title"));
		System.out.println(sectionTitle.getText());
		System.out.println(sectionTitle.isDisplayed());

		WebElement filterInputEl = driver.findElement(By.id("filter"));
		filterInputEl.sendKeys("SINGLE");

		WebElement paginatorCountLabel = driver.findElement(By.xpath("//div[@class='mat-paginator-range-label']"));
		String countLabel = paginatorCountLabel.getText();
		System.out.println(countLabel);
		//20 – 30 of 1734131
		String sub = countLabel.substring(countLabel.indexOf("of") + 3);
        System.out.println(sub);
		driver.quit();
	}

}

