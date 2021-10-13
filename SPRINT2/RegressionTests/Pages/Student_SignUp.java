package RegressionTestPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 //This class will store all the locators and methods of Login page
 
public class ELSignUp {
WebDriver driver;	



By faculty= By.xpath("//*[contains (text(),\"Teach courses\")]/preceding-sibling::input");
By student= By.xpath("//*[contains (text(),\"Follow courses\")]/preceding-sibling::input");
By firstname= By.id("registration_firstname");
By lastname= By.id("registration_lastname");
By emailid= By.id("registration_email");
By username= By.id("username");
By password= By.id("pass1");
By cpassword= By.id("pass2");

By registrationText=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/h2");

By registrationbutton= By.id("registration_submit");
//By registrationsuccess= By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]/text()[2]");
By YouCanNowSlect=By.id("form_register");


//creating parameterized constructor to initialize WebDriver reference
public ELSignUp(WebDriver driver)
{
	this.driver =driver;
}

public void registerFaculty()
{
	driver.findElement(faculty).click();
	driver.findElement(firstname).sendKeys("Faculty123");
	driver.findElement(lastname).sendKeys("Faculty123");
	driver.findElement(emailid).sendKeys("abc@gmail.com");
	driver.findElement(username).sendKeys("Teacher1234");
	driver.findElement(password).sendKeys("pass");
	driver.findElement(cpassword).sendKeys("pass");
	driver.findElement(registrationbutton).click();
	
}
public boolean success()
{
	
	
		//boolean regsuccess=driver.findElement(registrationsuccess).isDisplayed();
		boolean regsuccess=driver.findElement(YouCanNowSlect).isDisplayed();
		System.out.println(driver.findElement(YouCanNowSlect).getText());
		return regsuccess;
	

	
}

public void registerStudent() {
	// TODO Auto-generated method stub
	driver.findElement(student).click();
	driver.findElement(firstname).sendKeys("Student");
	driver.findElement(lastname).sendKeys("stud1");
	driver.findElement(emailid).sendKeys("abc@gmail.com");
	driver.findElement(username).sendKeys("stud123");
	driver.findElement(password).sendKeys("pass");
	driver.findElement(cpassword).sendKeys("pass");
	driver.findElement(registrationbutton).click();
	
}

public void checkbeginswithR() {
	// TODO Auto-generated method stub
	String exampleString = driver.findElement(registrationText).getText();
	System.out.println("\n"+exampleString);
	// String begins with R
	Pattern p = Pattern.compile("^R.*");
	Matcher m = p.matcher(exampleString);
	boolean b = m.matches();
	System.out.println("String begins with R is "+b);
	
}




}
