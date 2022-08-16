package selenium.weekotwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeworkRecap {
	
	/*
	 * Navigate to facebook and click on create new account. 
      then using css selector and Select class try to select from drop downs
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Ahmad");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Ahmadi");
		WebElement moblieNumberEl = driver.findElement(By.name("reg_email__"));
		moblieNumberEl.sendKeys("916-5156666");
		WebElement newPassEL = driver.findElement(By.cssSelector("input[data-type = 'password'"));
		newPassEL.sendKeys("Dai_657890!");
		Thread.sleep(1000);
		WebElement dob = driver.findElement(By.id("month"));
		Select month = new Select(dob);
		month.selectByIndex(4);
		WebElement days = driver.findElement(By.cssSelector("select#day"));
		Select day = new Select(days);
		day.selectByIndex(16);
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.cssSelector("select#year"));
		year.sendKeys("2002");
		Select years = new Select(year);
		years.selectByIndex(16);
		WebElement male = driver.findElement(By.cssSelector("input[value= '2']"));
		male.click();
		WebElement submitEl = driver.findElement(By.name("websubmit"));
		submitEl.click();
		driver.quit();
	}

}

