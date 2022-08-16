package selenium.weektwo.labsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		
		// Select Class to automate static drop down 
		// We can use only Select class with static drop down which has select tag
		// Select select = new Select(WebElement)
		// select.byIndex()
		//select.byValue()
		// select.byVisiableText
		
		WebElement numberOfPass = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		Select select = new Select(numberOfPass);
		//select.selectByValue("9");
		select.selectByIndex(8);
		
		/**
		 * dynamic dropdown means the searching is changable and it is not firmed
		 * how to handle a dynamic dropdown where it can't be handle by Select class
		 * step 1: we find webelement of the dropdown
		 * step 2: we use FindElements to store list of dropdown <option> 
		 * step 3: we use iterator for loop
		 * step 4: we write an if condition to click on option we want to select
		 * step 5: we break the loop and move to next process
		 */
		WebElement departure =driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		departure.clear();
		departure.sendKeys("Wash");
		//WebDriverWait wait = new WebDriverWait(driver,500);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("\"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li")));
		List<WebElement> airports = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
		System.out.println(airports.size());
		for(WebElement element:airports ) {
			System.out.println(element.getText());
			if(element.getText().contains("IAD")) {
				System.out.println("inside if ");
				element.click();
				break;
			}
		}
		
		System.out.println("out of loop");
		
		
		
	}

}
