package ElearningPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class studentsubscribecourse  {
	
	

	WebDriver driver;	

	By username= By.id("login");
	By password = By.xpath("//*[@id='password']");
	By loginbutton = By.linkText("Login");
    By coursecatalog = By.xpath("//*[@id=\'coursesCollapse\']/div/ul/li[3]/a");
    By searchtext=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/input");
    By searchicon=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button");
    By Subscribe = By.linkText("Subscribe");

    
	


	///creating parameterized constructor to initialize WebDriver reference
   public studentsubscribecourse(WebDriver driver)
   {
	   this.driver = driver;
   }

   
   
   

	public void Studentsubscribecourse() {
	// TODO Auto-generated constructor stub
		driver.findElement(coursecatalog).click();
		driver.findElement(searchtext).sendKeys("11Automation testing");
		driver.findElement(searchicon).click();
		
		
		
	    //driver.findElement(Subscribe).click();
		
	
	    /*
		
		if(driver.findElement(By.linkText("Subscribe")).isDisplayed()) {

	    	driver.findElement(Subscribe).click();

	    	   }
	    	   else {
	    	   System.out.println("Already subscribed");

	    	}
		*/
 }

   /*
	 public void subscribecourse()
	  {	
		driver.findElement(coursecatalog).click();
		driver.findElement(Subscribe).click();
		
	   }
	*/

	
	public boolean success_subscribecourse()
	{
		driver.findElement(Subscribe).click();
	    boolean regsuccess=driver.findElement(By.xpath("//*[@id=\'register\']")).isDisplayed();
	    System.out.println("\nCourse subscribed successfully");
		return regsuccess;
		

		
	}
	
}




