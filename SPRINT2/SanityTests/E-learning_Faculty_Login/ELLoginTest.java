
package com.appname.Testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appname.pages.ELLogin;
//import com.appname.pages.LoginPage;

public class ELLoginTest {
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
	public void CheckTitle()
	{
		
		 ELLogin login = new ELLogin(driver);
		
		String curTitle=login.getELLoginTitle(driver);
		Assert.assertEquals(curTitle, "My Organization - My education");	
		
	}
	
	@Test
	public void Login()
	{
		ELLogin login = new ELLogin(driver);
		boolean success=login.Login("amy", "aaa");
		Assert.assertEquals(success, true);
	}
}
			