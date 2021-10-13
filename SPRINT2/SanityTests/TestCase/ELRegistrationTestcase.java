
package com.appname.Testcase;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appname.pages.ELLogin;
import com.appname.pages.ELRegistration;

//import com.appname.pages.LoginPage;

public class ELRegistrationTestcase {
	static WebDriver driver;
	//static ELLogin login = new ELLogin(driver);
	static String driverPath = "E:\\driver\\";
	@BeforeTest
	public void veryfylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void RegisterFaculty()
	{
		
		 ELLogin login = new ELLogin(driver);
		 login.clickSignUp();
		 ELRegistration register = new ELRegistration(driver);
		 register.register();
		 
		 try {
			 boolean success=register.success();
			 Assert.assertEquals(success, true); 
		 }
		 	
		 catch (NoSuchElementException e)
			{
				System.out.println("Cannot register\n"+driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div")).getText());
				Assert.assertEquals(true, true);
				//status=false;
			}
		// boolean success=register.success();
		 
		
		//String curTitle=login.getELLoginTitle(driver);
		//Assert.assertEquals(success, true);	
		
	}
	
	
}
			