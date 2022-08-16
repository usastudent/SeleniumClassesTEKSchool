package selenium.weektwo.daythree;

import org.openqa.selenium.By;

public class LoginWithMethods {
	
	public static void main(String[] args) throws InterruptedException {
		//instantiate an object from class.
		CommonMethods common = new CommonMethods();
		
		common.setupDriver("https://tek-insurance.azurewebsites.net");
		common.sendTextToField(By.name("username"), "supervisor");
		common.sendTextToField(By.name("password"), "tek_supervisor");
		common.clicking(By.id("loginButton"));
		
		common.quiteBrowser();
		
	}

}

