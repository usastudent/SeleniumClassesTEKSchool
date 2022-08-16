package review;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	/*
	 * 1) In Selenium Project create a new Java class and Name it LabSessionPractice
	 * 2) make sure you have main method
	 * 3) Create a refrence variable to WebDriver and sssign object of ChromeDriver to open
	 * chrome browser
	 * 4) Navigate to this url http://ksrtc.in/oprs-web/
	 * 5) click on CRM link on top of the page
	 * 
	 * Note: make sure you have browser opened in maximize scale
	 * make sure you have proper wait for pageload and timeout
	 * make sure you use Webdriver Manager to setup chromeDriver
	 */
public class LabSessionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setup the WebDriver manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		timeWait();
		System.out.println(driver.getTitle() + " before clicking on CRM");
		crm.click();
		System.out.println(driver.getTitle() + " after clicking on CRM");
		
		
		/*
		 * In Selenium if we need to switch from one window to another window 
		 * we need to use a method called WindowHandles and the return type of 
		 * this method is Set
		 * 
		 * when we want to switch form parent to child we use WindowHandles
		 * 
		 */
		Set<String> handles = driver.getWindowHandles();
		// we use Iterator Interface to iterate through the Set of Widow Handles 
		// and we use .next method to store the value of the set.
		// syntax for Iterator: Iterator<dataType> variableName = Variable Name of Collection.iterator Method
		
		/*
		 * Iterator is like loop,it is an interface which is used specially in collections
		 * for loop starts from index zero and when it reach to the condition for exp:-
		 * - number ten, then the loop after reaching to the condition will break but-
		 * - Iterator first check the index and then it moves
		 * 
		 * for exp: Iterator.next : it will check first if ther is any next index then it -
		 * -will be moved
		 * 
		 * Iterator can remove the element while the loop can not remove the element
		 * 
		 * Each windows tab has its own ID which whenever we open a new tab this ID wil be -
		 * - generated automatically and it is changable
		 */
		
		Iterator <String> iterator = handles.iterator();
		String parentWindowID = iterator.next();
		String childWindowID = iterator.next();
		System.out.println(parentWindowID + " parent");
		System.out.println(childWindowID+ " child");
		
		driver.switchTo().window(childWindowID); // it switch parent tab to child tab
		System.out.println(driver.getTitle() + " after clicking on CRM");
		
		// challenge : close the current tab and switch back to parent and print 
		// title of parent page. - 3 min
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle()+ " back to parent window");
		// click on Search button 
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();
		// pop up ; gives you an alart. exp: that you need to fill unforgettable elements
		// in Selenium WebDriver there is a method called switchTo().Alert()
		// .accept() 			.dismiss()			getText 
		driver.switchTo().alert().accept();
		// in Selenium we can automate WebBased Authentication by passing username
		// and password with in the url following below syntax:
		// http://userName:password@baseURL
		// website: http://the-internet.herokuapp.com/basic_auth
		// userName: admin 
		// password: admin
		// http://admin:admin@the-internet.herokuapp.com/basic_auth
		// for example: https:tekschool.us student  1234 
		// https://student:1234@tekschool.us
		
		// we can put user name and pasword in our url beside the main http to remove browser-
		//-pup up
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
	
	
	public static void timeWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
