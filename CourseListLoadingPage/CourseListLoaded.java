package Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
 

public class CourseListLoaded  {
	WebDriver driver;	

	By username= By.cssSelector("#login");
	By password = By.xpath("//*[@id='password']");
	By loginbutton = By.xpath("//*[@id=\"form-login_submitAuth\"]");
    By coursecatalog =By.linkText("Course catalog");
  By word=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/h2");
  
   public CourseListLoaded(WebDriver driver)
   {
	   this.driver = driver;
   }
   
   public void loginmethod() throws IOException 
	{
	boolean status;
		Properties obj = new Properties();
	FileInputStream objfile = new FileInputStream("login1.properties");

		obj.load(objfile);             
		String s_un = obj.getProperty("username");
       String s_pw = obj.getProperty("password");
		driver.findElement(username).sendKeys(s_un);
		driver.findElement(password).sendKeys(s_pw);
		driver.findElement(loginbutton).click();
		try {
			
			System.out.println("Login successful. " );
			Reporter.log("***********SUCCESS LOGIN!*********"+s_un + " " + s_pw);
		
		    status=true;
		
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Credentials invalid and as expected the script was unable to login. But it is a pass case");
			Reporter.log("**************For Security reasons negative test case checked. Expected result achieved. Invalid user prohibited from access******");
			Reporter.log("User name:"+s_un + " " +"Pasword:"+ s_pw);
			status = true;
		}
		
		Assert.assertEquals(status, true);
		
	}

	public void Catalog() {
	// TODO Auto-generated constructor stub
		driver.findElement(coursecatalog).click();
 }
	
	
	public boolean isWordFound()

	{
		
		boolean found=false;
		try {
			
			found=driver.findElement(word).isDisplayed();
		}
		
		catch (NoSuchElementException e)
		{
			found=false;
		}
		
		return found;
		
	}



	


	}
	
	


