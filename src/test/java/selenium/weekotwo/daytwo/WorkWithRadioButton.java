package selenium.weekotwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		// maximize window after navigation
		driver.manage().window().maximize();

		WebElement createAccountEl = driver.findElement(By.linkText("Create new account"));
		createAccountEl.click();
		Thread.sleep(1000);

		WebElement maleRadioButton = driver
				.findElement(By.cssSelector("span[data-name='gender_wrapper'] > span:nth-child(2) > input"));
		
		//isSelected Method is used check and radioButton or check-box is selected or not.
		//it's returning boolean false if not selected and true if it's selected.
		boolean isRadioButtonSelected = maleRadioButton.isSelected();
		System.out.println("Before clicking " + isRadioButtonSelected);
		maleRadioButton.click();
		isRadioButtonSelected = maleRadioButton.isSelected();
		System.out.println("After clicking " + isRadioButtonSelected);

		Thread.sleep(5000);
		driver.quit();
	}

}

