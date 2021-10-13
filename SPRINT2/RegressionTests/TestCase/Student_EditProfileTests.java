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
import ElearningPages.StudentEditProfilePages;
import ElearningPages.elogin;



public class StudentEditProfileTests {
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
	public void StudentEditProfile()
	{
		elogin login = new elogin(driver);
		 login.typeusername("anjanaomanakuttan99");
		 login.typepassword("anjana");
		 login.clickLoginButton();
		 //ELLogin login = new ELLogin(driver);
		 //login.clickSignUp();
		 StudentEditProfilePages editprofile = new StudentEditProfilePages(driver);
		 editprofile.editprofile();
		 
		 //login.typeusername("anjanaomanakuttan99");
		 //login.typepassword("anjana");
		 
		 //boolean success=register.success();
		//String curTitle=login.getELLoginTitle(driver);
		//Assert.assertEquals(success, true);	
		
	}
}	
	

			
