package selenium.weektwo.dayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMethodInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//maximize window
		driver.manage().window().maximize();
		
		WebElement createNewLinkEl = driver.findElement(By.linkText("Create new account"));
		createNewLinkEl.click();
		
		Thread.sleep(2000);
		WebElement monthDropDownEl = driver.findElement(By.cssSelector("select#month"));
		Select select = new Select(monthDropDownEl);
		select.selectByIndex(6);
		
		Thread.sleep(6000);
	}

}

