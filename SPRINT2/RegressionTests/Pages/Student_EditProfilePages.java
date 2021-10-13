package ElearningPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



//This class will store all the locators and methods of Login page
public class StudentEditProfilePages {
	WebDriver driver;	
	By editprofile= By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[5]/a");
	/*By firstname= By.id("profile_firstname");
	By lastname= By.id("profile_lastname");*/
	/*By username= By.id("username");
	By code= By.id("profile_official_code");
	By emailid= By.id("profile_email");
	By phone= By.id("profile_phone");*/
	By image=By.id("picture");
   //By language=By.id("profile_language");*/
	By currentpassword= By.id("profile_password0");
	By newpassword= By.id("password1");
	By cpassword=By.id("profile_password2");
	/*By skype= By.id("extra_skype");
	By linkedin= By.id("extra_linkedin_url");*/
	By savesettings= By.id("profile_apply_change");
	By loginsuccess= By.xpath("//*[@id=\"cm-content\"]");
	By profile=By.id("cm-content");

	
	
	//creating parameterized constructor to initialize WebDriver reference
	public  StudentEditProfilePages(WebDriver driver)
	{
		this.driver =driver;
	}

	
	
	public void editprofile()
	{
		driver.findElement(editprofile).click();
		/*driver.findElement(firstname).sendKeys("Anjana");
		driver.findElement(lastname).sendKeys("Omanakuttan");*/
		/*driver.findElement(username).sendKeys("anjanaomankuttan99");
		driver.findElement(code).sendKeys("ANJANA_OMANAKUTTAN");
		driver.findElement(emailid).sendKeys("anjana@gmail.com");
		driver.findElement(phone).sendKeys("1234567890");*/
		driver.findElement(image).sendKeys("C:\\Users\\Admin\\Desktop\\Sprint2_Elearning\\elearning.jpg");
	    //driver.findElement(language).sendKeys("English");
		driver.findElement(currentpassword).sendKeys("anjana");
		driver.findElement(newpassword).sendKeys("anjana@1234");
		driver.findElement(cpassword).sendKeys("anjana@1234");
		driver.findElement(savesettings).click();
		
	}
	
	
	
	public boolean success()
	{
		boolean loginsuccess=driver.findElement(savesettings).isDisplayed();
		boolean logsuccess=driver.findElement(profile).isDisplayed();
		return logsuccess;

	}
}


