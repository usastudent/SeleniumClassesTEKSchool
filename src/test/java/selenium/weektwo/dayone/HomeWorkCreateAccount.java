package selenium.weektwo.dayone;
 
		/*
		 * Homework

		 * login to tek insurance app
		 * click on menu and then click on accounts 
		 * click on add account
		 * fill up the form
		 * click on submit
		 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWorkCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tek-insurance.azurewebsites.net");
		driver.manage().window().maximize();
//		driver.getTitle();
//		String title = driver.getTitle();
//		System.out.println(title);
		WebElement userNameEl = driver.findElement(By.name("username"));
		userNameEl.sendKeys("supervisor");
		WebElement passEl = driver.findElement(By.name("password"));
		passEl.sendKeys("tek_supervisor");
		WebElement loginEl = driver.findElement(By.id("loginButton"));
		loginEl.click();
		Thread.sleep(1000);
		
		WebElement leftButton = driver.findElement(
				By.xpath("//mat-icon[contains(text(),'menu')]"));
		leftButton.click();
		
//		WebElement account = driver.findElement(By.xpath(
//				"/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer/div/app-menu-items/mat-nav-list/div/a/span[1]/span"));
		WebElement accountLinkEl = driver.findElement(By.xpath("//span[contains(text(),'Accounts')]"));
		accountLinkEl.click();
		Thread.sleep(1000);
		WebElement addEl = driver.findElement(By.xpath("//mat-icon[contains (text(), 'add')]"));
		addEl.click();
		Thread.sleep(1000);
		WebElement emailAddress = driver.findElement(By.name("email"));
		emailAddress.sendKeys("John_Varner@gmail.com");
		Thread.sleep(1000);
		//try to not use numbers in the xpaths. it's not safe and will change every time you refresh. 
		WebElement titleEl = driver.findElement(By.xpath("//mat-select[@name='title']//div[contains(@class,'mat-select-arrow-wrapper')]"));
		titleEl.click();
		Thread.sleep(1000);
		//If xpath is not unique use parent or change your xpath
		WebElement menTitle = driver.findElement(By.xpath("//mat-option//span[contains(text(), 'Mr.')]"));
		menTitle.click();
		Thread.sleep(1000);
		
		WebElement firstNameEl = driver.findElement(By.name("firstName"));
		firstNameEl.sendKeys("John");
		Thread.sleep(1000);
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Varner");
		Thread.sleep(1000);
		
		WebElement genderEl = driver.findElement(By.xpath("//mat-select[ @name = 'gender']"));
		genderEl.click();
		WebElement maleEl = driver.findElement(By.xpath("//span[ contains(text(),'Male')]"));
		maleEl.click();
		WebElement maritalEl = driver.findElement(By.xpath("//mat-select[@name='maritalStatus']"));
		maritalEl.click();
		WebElement marriedEl = driver.findElement(By.xpath("//span[contains(text(),'Married')]"));
		marriedEl.click();
		WebElement employmentEl = driver.findElement(By.name("employmentStatus"));
		employmentEl.sendKeys("Manager");
		Thread.sleep(1000);
		WebElement dateOfBirthEl = driver.findElement(By.name("dateOfBirth"));
		dateOfBirthEl.sendKeys("05/01/1980");
		//   /.. this will go one level back in the elements. 
		
		WebElement submitEl = driver.findElement(By.xpath("//span[contains(text(),'Submit')]/.."));
		submitEl.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}

	
		   
	
            
	
           
           
