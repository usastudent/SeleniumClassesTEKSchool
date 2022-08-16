package selenium.weekone.daytwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorTagName {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://tek-insurance.azurewebsites.net");
		
		/*
		 * if you use findElement it is only for finding one element in a web page.
		 * 
		 * If you are looking for multiple elements in a Web page you have to add 's' at
		 *the end of it , findElements => it returns List<WebElement> : collection of WebElemennt
		 */
		
// here we have two buttons in web page so we use findElements which returns List<webElement>
		List<WebElement> buttonElements =driver.findElements(By.tagName("button"));
		System.out.println(buttonElements.size());

	}

}
