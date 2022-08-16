package selenium.weektwo.daythree;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountHomeWork {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		try {
			driver.get("https://tek-insurance.azurewebsites.net");
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement usernameElem = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='username']")));
			usernameElem.sendKeys("supervisor");
			WebElement passwordEl = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='password']")));
			passwordEl.sendKeys("tek_supervisor");

			WebElement loginBtnEl = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#loginButton")));
			boolean isLoginBtnEnabled = loginBtnEl.isEnabled();
			if (isLoginBtnEnabled == true) {
				loginBtnEl.click();
			} else {
				throw new RuntimeException("Login Button Should Be enabled at this point");
			}

			WebElement humbergerMenuEl = wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector("mat-toolbar.mat-toolbar > button:first-child")));
			humbergerMenuEl.click();

			WebElement accountMenuEl = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounts")));
			accountMenuEl.click();

			WebElement sectionTitleEl = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.cssSelector("mat-card-title.mat-card-title")));
			String sectionTitle = sectionTitleEl.getText();
			if (sectionTitle.equals("Accounts")) {
				System.out.println("Account section is loaded");
			} else {
				throw new RuntimeException("Section Title should be Accounts");
			}

			WebElement newAccountBtnEl = wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector("div.newAccountSection > button:first-child")));
			newAccountBtnEl.click();

			WebElement emailEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#email")));
			emailEl.sendKeys("someone@email.com");

			WebElement titleEl = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[name='title']")));
			titleEl.click();
			// dynamically select logic for selecting from drop down.
			List<WebElement> titleListEl = wait
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span.mat-option-text")));
			for (WebElement element : titleListEl) {
				String elementText = element.getText();
				if (elementText.equals("Ms.")) {
					element.click();
					break;
				}
			}

			WebElement firstNameEl = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#firstName")));
			firstNameEl.sendKeys("Some Body");

			WebElement lastNameEl = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='lastName']")));
			lastNameEl.sendKeys("Somebody Last name");

			WebElement genderDropDownEl = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[name='gender']")));
			genderDropDownEl.click();
			// dynamically select logic for selecting from drop down.
			List<WebElement> genderListOptions = wait
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span.mat-option-text")));
			for (WebElement element : genderListOptions) {
				String elementText = element.getText();
				if (elementText.equals("Female")) {
					element.click();
					break;
				}
			}

			WebElement maritalStatusDropDownEl = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[name='maritalStatus']")));
			maritalStatusDropDownEl.click();

			// dynamically select logic for selecting from drop down.
			List<WebElement> martialStatusOptions = wait
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span.mat-option-text")));
			for (WebElement element : martialStatusOptions) {
				String elementText = element.getText();
				if (elementText.equals("Single")) {
					element.click();
					break;
				}
			}

			WebElement emplStatusEl = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='employmentStatus']")));
			emplStatusEl.sendKeys("Shareholder of Tesla");

			WebElement dateOfBirthEl = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='dateOfBirth']")));
			dateOfBirthEl.sendKeys("06/02/1980");

			WebElement submitEl = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
			submitEl.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		} finally {
			driver.quit();
		}

	}

}
