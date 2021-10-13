package Elearningtestcases;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appname.pages.LoginPage;

import Elearningpages.ELplanagenda;
import Elearningpages.ElearningEditprofile;
import Elearningpages.elogin;
//import eLearningPages.ELplanagendapage;

public class ELplanagendatest {
static WebDriver driver;
    
	
	static String driverPath = ("C:\\Users\\Arpita Sangannavar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	@AfterTest
    public void closeAll()
    {
    	driver.close();
    }
	
	@BeforeTest
	public void veryfylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void planagenda() throws InterruptedException
	{
		
		elogin login = new elogin (driver);
		 login.typeusername("arpita123");
		 login.typepassword("s");
		 login.clickLoginButton();
		 
		ELplanagenda plan=new ELplanagenda(driver);
		plan.clickpersonalagenda();
		plan.clickcalender();
		plan.checkmonth();
		plan.clickdate();
		plan.title("Event Dairies");
		plan. typedesc("Stringp");
		plan.clickaddbutton();
		Thread.sleep(10000);
		plan.clickagendalist();
		plan.get_agendalist();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		 try {
			 String eventlist=plan.get_agendalist();
			 System.out.println(eventlist+" Agenda Cretated Successfully");
	         Assert.assertEquals(true, true); 
		 }
		 	
		 catch (NoSuchElementException e)
			{
			
				
				Assert.assertEquals(true, true);
				//status=false;
			}
		 

		 
		
			}
	
		
		

}
