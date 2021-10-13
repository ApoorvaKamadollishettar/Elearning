/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


 //This class will store all the locators and methods of Login page
 
public class eLearningLoginPage {
WebDriver driver;	

By username= By.id("login");
By password = By.xpath("//*[@id='password']");
By loginbutton = By.id("form-login_submitAuth");

By footerText = By.xpath("//*[contains(text(),'Administrator')]/parent::div");


//creating parameterized constructor to initialize WebDriver reference
public eLearningLoginPage(WebDriver driver)
{
	this.driver =driver;
}




public String getFooterString()
{
	String footerString;
	
	try {
		
		WebElement element = driver.findElement(footerText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);

		js.executeScript("arguments[0].style.border='2px solid red'", element);


		
		footerString=driver.findElement(footerText).getText();
	}
	
	catch (NoSuchElementException e)
	{
		footerString="Not found";
		// Create instance of Javascript executor

	}
		return footerString;
	}




public boolean isFooterFound()

{
	
	boolean found=false;
	try {
		
		WebElement element = driver.findElement(footerText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);

		js.executeScript("arguments[0].style.border='2px solid red'", element);

		found=driver.findElement(footerText).isDisplayed();
	}
	
	catch (NoSuchElementException e)
	{
		found=false;
	}
	
	return found;
	
}	
	
}


