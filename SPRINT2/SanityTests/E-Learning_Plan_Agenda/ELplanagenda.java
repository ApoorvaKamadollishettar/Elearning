package Elearningpages;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ELplanagenda {
WebDriver driver;	
    
   static String month1="October 2021";
   
	By personalagenda =By.linkText("Personal agenda");
	By calender=By.cssSelector("#toolbar-agenda > div > div:nth-child(1) > a:nth-child(1) > img");
	By month=By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[1]");
    By date=By.xpath("//*[@data-date='2021-10-25']");
    By week=By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[2]");
    By day=By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[3]");
    By time=By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[21]/td[2]");
    By title=By.id("title");
    By desc=By.xpath("/html");
    By addbutton=By.xpath("/html/body/div[4]/div[11]/div/button/span");
    By agendalist=By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[4]");
    By eventlist=By.xpath("//*[@id=\"calendar\"]/div[2]/div/div");
    
    public ELplanagenda(WebDriver driver)
	{
		this.driver =driver;
	}
   
    public void clickpersonalagenda()
	{
		driver.findElement(personalagenda).click();
	}
	public void clickcalender()
	{
		driver.findElement(calender).click();
	}
	public void clickmonth()
	{
		driver.findElement(month).click();
	
	}
	public void checkmonth()
	{
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/h2")).getText();
			if(text.equals(month1))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[1]/div/button[3]")).click();			
			}
			
		}
	}
	public void clickdate()
	{
		driver.findElement(date).click();
	}
	public void clickweek()
	{
		driver.findElement(week).click();
	
	}
	public void clickday()
	{
		driver.findElement(day).click();
	
	}
	public void clicktime()
	{
		driver.findElement(time).click();
	
	}
	
	public void title(String s) {
		driver.findElement(title).sendKeys(s);
	}
	
	public void typedesc(String p)
	{
		driver.findElement(desc).sendKeys(p);
		
	}
	public void clickaddbutton()
	{
		driver.findElement(addbutton).click();
	}
	public void clickagendalist()
	{
		 driver.findElement(agendalist).click();
	}
	
	

	public String get_agendalist() {
		// TODO Auto-genered method stub
	return  driver.findElement(eventlist).getText();
		
	}

	
	
}

	
	


	
	

	
	



