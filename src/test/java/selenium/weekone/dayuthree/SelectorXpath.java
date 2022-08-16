package selenium.weekone.dayuthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorXpath {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * selectors are : id, name, class name, tag  name, linkText, partial Link Text,
		 *  xpath, css.
		 *  
		 *  Attributes are like keyword in java; each one the selecotr is one Attribue
		 *  exp: id is an attribute as name is an attribute.
		 *  
		 *  Element : every thing which there is on the web page is one element
		 *  
		 */
		
		/*
		 * Xpath : is the path or address to the element
		 * 
		 *  There are two Xpath type:
		 *  1) Absolute Xpath ( FullXpath )
		 *  2) Relative Xpath
		 *  
		 *  1) Absolute Xpath gives us the complete path from start to the end to get to the 
		 *  element, it starts with /html and goes to each class one by one till end
		 *  
		 *  *** First way : we can manually inspect through the links to find out the address.
		 *  
		 *  exp: /html/body/app-root/app-login/div/mat-card-title/storng
		 *  exp: /html/body/app-root/app-login/div/mat-card/mat-card-content/form/
		 *  mat-form-field[1]/div/div/div/input
		 *  
		 *  *** Second way : we can right click on it and copy it as : copy full Xpath
		 *  it gives us the full path to the address.
		 *  
		 *  2) Relative xpath:
		 *  in relative xpath , you are going directly to the element, not fully direction
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		
		WebElement usernameElement = driver.findElement(By.xpath("/html/body/app-root/app-login"
		+ "/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div[3]/input"));
		usernameElement.sendKeys("supervisor");
		
		WebElement paswordElement = driver.findElement(By.xpath("/html/body/app-root/app-login"
		+ "/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[3]/input"));
		paswordElement.sendKeys("tek_supervisor");
		
		WebElement loginButtton = driver.findElement(By.xpath("/html/body/app-root/app-login"
				+ "/div/mat-card/mat-card-content/form/button[1]/span[1]"));
		loginButtton.click();
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
