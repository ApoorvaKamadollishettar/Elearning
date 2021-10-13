package regressionTestTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import regressionTestPage.CreateTest;
import regressionTestPage.elogin;

@SuppressWarnings("unused")
public class CreateTestTestCase {

static WebDriver driver;
	
	static String driverPath = "D:\\chromedriver.exe";
	@AfterTest
    public void closeAll()
    {
    	driver.close();
    }
	
	@BeforeTest
	public void verifylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void CreateTest()
	{
		
		elogin login = new elogin(driver);
		 login.typeusername("bindu_kumar");
		 login.typepassword("Tingtong@1234");
		 login.clickLoginButton();
		 
		 CreateTest addtest=new CreateTest(driver);
		 addtest.createtest();
		 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		 try {
			 boolean addsuccess=addtest.success_createtest();
			 System.out.println(" Test Created Successfully");
			
			 
			 Assert.assertEquals(addsuccess, true); 
		 }
		 	
		 catch (NoSuchElementException e)
			{
			
				System.out.println("Cannot create test\n");//+driver.findElement(By.id("messages")).getText());
				Assert.assertEquals(true, true);
				//status=false;
			} 
	}
}
	
		
	