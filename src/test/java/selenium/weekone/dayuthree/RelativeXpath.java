package selenium.weekone.dayuthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Relative Xpath:
		 * in relative xpath , you are going directly to the element, not fully direction
		 * you can use the attributes of these elements to address the element till -
		 * -selenium can find it.
		 * 
		 * how to write the address:
		 * 1) if we find out one of the attribute inside :
		 * 
		 * first put: //
		 * then type the tage name that you are looking for , exp: //Input
		 * because we could have multiple option we open an [] and put @ then use one of the
		 * Attributes then = the value infont of the attribute inside ' '
		 * 
		 * Exp:  username relative xpath address : first way: //input[@type='text']
		 *                                         second way : //input[@name='username']
		 *      password relative xpath address :
		 *         //input[@type='password']  
		 *         
		 *         exp: //div[contains(class,'banner')]
		 *         
		 *         
		 * 2) if there is no Attribute of element, then we use
		 *  [contains(text(), ' part of text')]                                  
		 *      exp: for title address : //span[contains(text(),'Tek Insurance')]
		 *      look for elements which contains text.                       
		 */

			// login practice with relative xpath
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		
		WebElement usernameElement = driver.findElement(By.xpath("//input[@name='username']"));
		usernameElement.sendKeys("supervisor");
		
		WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
		passwordElement.sendKeys("tek_supervisor");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		Thread.sleep(1000);
				
		
		WebElement titleElement = driver.findElement(
				By.xpath("//span[contains(text(),'Tek Insurance')]"));
		System.out.println(titleElement.isDisplayed());
		driver.quit();
		
		
	}

}
