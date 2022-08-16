package selenium.weektwo.daythree;

import org.openqa.selenium.By;

public class ReletiveXpathWithLogin {
	
	public static void main(String[] args) {
		
		CommonMethods common = new CommonMethods();
		common.setupDriver("https://tek-insurance.azurewebsites.net");
		common.sendTextToField(By.xpath("//input[@name='username']"), "supervisor");
		common.sendTextToField(By.xpath("//input[@name='password']"), "tek_supervisor");
		common.clicking(By.id("loginButton"));
		
		common.getElementText(By.xpath("//mat-toolbar/span[1]"));
		common.quiteBrowser();
	}

}
