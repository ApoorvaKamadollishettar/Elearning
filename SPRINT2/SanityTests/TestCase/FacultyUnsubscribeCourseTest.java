package ElearningTestcase;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import ElearningPages.ELLogin;
import ElearningPages.FacultyUnsubscribeCoursePages;
import ElearningPages.elogin;



public class FacultyUnsubscribeCourseTest {
	
	static WebDriver driver;
	//static ELLogin login = new ELLogin(driver);
	//static String driverPath = "E:\\driver\\";
	
	
	
	@BeforeTest
	public void veryfylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void FacultyUnsubscribeCourse()
	{
		elogin login = new elogin(driver);
		 login.typeusername("faculty11");
		 login.typepassword("faculty@123");
		 login.clickLoginButton();
		 //ELLogin login = new ELLogin(driver);
		 //login.clickSignUp();
		 FacultyUnsubscribeCoursePages ucourse = new FacultyUnsubscribeCoursePages(driver);
		 ucourse.ucourse();
		 //boolean success=register.success();
		//String curTitle=login.getELLoginTitle(driver);
		//Assert.assertEquals(success, true);	
		
	}

}
