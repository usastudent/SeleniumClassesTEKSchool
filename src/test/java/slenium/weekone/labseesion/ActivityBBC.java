package slenium.weekone.labseesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActivityBBC {
	
	//Navigate to https://www.bbc.com
	//Find out how many link is in home page. 
	//hint: the tag for links are <a>
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.bbc.com/");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		links.get(280).click();
		Thread.sleep(4000);
		driver.quit();
	}
}

