package ElearningPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class StudentUnsubscribeCourse {

	WebDriver driver;	

	By username= By.id("login");
	By password = By.xpath("//*[@id='password']");
	By loginbutton = By.id("form-login_submitAuth");
	By coursecatalog = By.xpath("//*[@id=\'coursesCollapse\']/div/ul/li[3]/a");
	By seachtext=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/input");
    By searchicon=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button");
	//By sortcourse = By.xpath("//*[@id=\'coursesCollapse\']/div/ul/li[1]/a");
	By unsubscribe = By.linkText("Unsubscribe");

	
	
	public StudentUnsubscribeCourse(WebDriver driver)
	   {
		   this.driver = driver;
	   }
	
	public void Unsubscribecourse() 
	{
		// TODO Auto-generated constructor stub
			
			driver.findElement(coursecatalog).click();
			driver.findElement(seachtext).sendKeys("sap aggregates");
			driver.findElement(searchicon).click();
			//driver.findElement(unsubscribe).click();
			//driver.switchTo().alert().accept();      // Clicks OK button, switchTo().alert().dismiss() clicks cancel button
	 
    }
	
	public boolean success_unsubscribecourse()
	{
		
		driver.findElement(unsubscribe).click();
	    boolean regsuccess=driver.findElement(By.xpath("//*[@id=\'register\']")).isDisplayed();
	    System.out.println("\nCourse Unsubscribed successfully");
		return regsuccess;
		

		
	}
	
}

