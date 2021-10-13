package TestCase;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import Page.CourseListLoaded;

public class CourseListLoadedTestCase {

	    static WebDriver driver;	
		  
	    
	@BeforeTest
	    public void initialize()
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\akamadol\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();		
	}
	
	
	@Test(priority=0)
	public void CourseCatalog()
	{
		
		 CourseListLoaded login = new CourseListLoaded(driver);
		try {
			login.loginmethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 CourseListLoaded sub = new CourseListLoaded(driver);
		 sub.Catalog();
		 
	}
	@Test(priority=2)
	public void checkPageLoaded()
	{
    	CourseListLoaded login=new CourseListLoaded(driver);
		
    	boolean isfound=login.isWordFound();
		if (isfound==true)
		{
			System.out.println("Course Catalog Page loaded successfully!!!");
			
		}
		 
		else
		{
			System.out.println("Course Catalog failed to load.....");
		}
		  
		
	}
	
	
	
}
    
/*
		@AfterTest
		public void closeAll()
		{
			driver.close();

		}
		*/

	
			

	
	
	
			