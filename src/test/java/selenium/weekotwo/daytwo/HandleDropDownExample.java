package selenium.weekotwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownExample {
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
		//First option to select from drop down is selectByIndex (as always index start from 0).
		monthSelect.selectByIndex(1);
		Thread.sleep(1000);
		//select day. we are using selectByValue
		WebElement bdayElement= driver.findElement(By.cssSelector("select[name='birthday_day']"));
		Select bdaySelect = new Select(bdayElement);
		bdaySelect.selectByValue("27");
		Thread.sleep(1000);
		//Select year. we are going to use selectByVisibleText. 
		WebElement yearElement = driver.findElement(By.cssSelector("select[title='Year']"));
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByVisibleText("1987");
		
		//Thread.sleep also called a hard wait. 
		Thread.sleep(5000);
		driver.quit();
		
		//Break time 23 Min. till 8 PM PST / 11:00 PM EST . 
	}

}

