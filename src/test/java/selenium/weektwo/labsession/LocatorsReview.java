package selenium.weektwo.labsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsReview {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail");
		
		// what is attribute:    first word is tagname:input ,  Attribute = value
		// exp: type ="text", id="input-firstname",
		
//		driver.findElement(By.id("top-links"));
//		driver.findElement(By.name("code"));
//		driver.findElement(By.tagName("input"));
//		driver.findElement(By.xpath("//input[@name='firstName']"));
		/**
		 * absolute xpath: /html/div to the end
		 * relative xpath: // then it starts from the tag of the element
		 * 
		 * Syntax for Relative Xpath //tagname[@attribute = 'value']
		 * syntax for relative xpath //tagname[text()='value of text']
		 * 
		 * how you can handle dynamic? dynamic means keep changing, bellow :
		 * syntax for relative xpath //tagname[contains(text(),'value')]
		 * 
		 * syntax for relative xpath // tagname[@attribute='value' and @attribute='value']
		 * Exp: //input[@class='form-control' and @name='password']
		 * 
		 * syntax for relative xpath (//tagname[@attribute = 'value'])[index Number]
		 * Exp: (//span[text()='Add to Cart'])[1]= we can use this structure if we face with-
		 * - that has many the same name. when they have everything in common.
		 * 
		 * Syntax for cssSelector tagName[attribute='value']
		 * cssSelector is faster than xpath, in xpath we can travel from parent to child-
		 * -and from child to parent but in CSS we can not do that.
		 */
		//driver.findElement(By.cssSelector("input[name='firstName']"));
		
		/*
		 * if you see the tag input , it means it accepts value
		 * if you see tag a , it means it is a link
		 * if you see li , it means it is list of elements
		 * tr : it stands for rows
		 * td:  it stands for columsn
		 * table:  it stands for table
		 */
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i= 0; i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
		}
		
	
			
	}

}

