package selenium.weekone.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToTekInsuranceApp {

	// navigate to http://tek-insurance.azurewebsites.net
			// using Chrome browser and get title print title in console
			// and close the browser
			// make sure title is Tek Insurance Service.
			// if not fail the test
			// username= supervisor
			// password= tek_supervisor
	
	public static void main(String[] args) {
		
		// setup Chrome driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to the URL
		driver.get("http://tek-insurance.azurewebsites.net");
		
		//Retrieve the title web application
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Tek Insurance Service")) {
			System.out.println("Test Is Passed");
		}else {
			System.out.println("Titile is not matching");
		}
		
		 /**
		  * what is WebElement : 
		  * webElement is an interface that represents elements of the Web page.
		  * the methods that used to interact with element.
		  *  with WebElement you can access to some methods
		  *  
		  *  base on the element you get for the web page , you have to perform the task.
		  *  if that element that you will get from web page is text, you can get text.
		  *  if you perform send key it will throw exception.
		  *  
		  */
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-login/div/"
				+ "mat-card/mat-card-title[1]/strong"));
		
			String loginFormTitle=element.getText();	
			System.out.println(loginFormTitle);
		//quitting the browser.closing
		driver.quit();
		

	}

}
