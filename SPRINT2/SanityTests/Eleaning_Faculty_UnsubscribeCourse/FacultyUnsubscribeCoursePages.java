package ElearningPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;



//This class will store all the locators and methods of Login page
public class FacultyUnsubscribeCoursePages {
	WebDriver driver;
	//By sortcourse= By.xpath("//*[@id=\"coursesCollapse\"]/div/ul/li[2]/a");
	By coursecatalog = By.xpath("//*[@id=\"coursesCollapse\"]/div/ul/li[4]/a");
	By seachtext=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/input");
	By searchicon=By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div/div[1]/form/div/div/button");
	By unsubscribe= By.xpath("//*[@id=\"cm-content\"]/div/div[3]/div/div/div[2]/div[4]/div/a");
	By unsubscribed=By.id("cm-content");
	// By Subscribe = By.xpath("//*[@id=\'cm-content\']/div/div[3]/div[12]/div/div[2]/div[4]/div/a");
	
	
	//creating parameterized constructor to initialize WebDriver reference
	public FacultyUnsubscribeCoursePages (WebDriver driver)
	{
		this.driver =driver;
	}
	
	
	
	public void ucourse()
	  {	
		driver.findElement(coursecatalog).click();
		driver.findElement(seachtext).sendKeys("testing selenium");
		driver.findElement(searchicon).click();
		driver.findElement(unsubscribe).click();
		//driver.switchTo().alert().accept();
	   }

	
	
	public boolean success()
	{
	//boolean loginsuccess=driver.findElement(sortcourse).isDisplayed();
	boolean logsuccess=driver.findElement(unsubscribe).isDisplayed();
	return logsuccess;

	}

}
