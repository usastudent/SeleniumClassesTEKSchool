package selenium.weekotwo.daytwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionMethodInSelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//maximize window after navigation
		driver.manage().window().maximize();
		
		WebElement createAccountEl = driver.findElement(By.linkText("Create new account"));
		createAccountEl.click(); 
		Thread.sleep(1000);
		
		WebElement monthSelectEl = driver.findElement(By.cssSelector("select#month"));
		Select monthSelect = new Select(monthSelectEl);
		monthSelect.selectByValue("2");
		
		
		// it gives you option to see the list for example
		
		List<WebElement> options = monthSelect.getOptions();
		
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
	}

}

