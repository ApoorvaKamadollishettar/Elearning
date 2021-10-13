package regressionTestPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


 //This class will store all the locators and methods of Login page

@SuppressWarnings("unused")
public class CreateTest {
WebDriver driver;	

By Coursename=By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/a");
By Selectcourse=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div/div[2]/h4/a");
By NewTest=By.id("istooldesc_26243");
By createnewtest=By.xpath("//*[@id=\"cm-content\"]/div/div[3]/a[1]/img");
By Testname=By.id("exercise_title");
By AddTest=By.cssSelector("#exercise_admin_submitExercise");
By view= By.cssSelector("#cm-content > div > ul > li:nth-child(2) > a");
By Tname=By.xpath("//*[@id=\"cm-content\"]/div/ul/li");
By openq=By.xpath("//*[@id=\"cm-content\"]/div/div[6]/div/ul/li[5]/div/a/img");
By quest=By.id("question_admin_form_questionName");
By score=By.id("question_admin_form_weighting");
By addquest=By.id("question_admin_form_submitQuestion");

public CreateTest(WebDriver driver)
{
	this.driver =driver;
}

public void createtest()
{
	driver.findElement(Coursename).click();
	driver.findElement(Selectcourse).click();
	driver.findElement(NewTest).click();
	driver.findElement(createnewtest).click();
	driver.findElement(Testname).sendKeys("Module1");
	driver.findElement(AddTest).click();
	driver.findElement(openq).click();
	driver.findElement(quest).sendKeys("What is automation testing");
	driver.findElement(score).sendKeys("10");
	driver.findElement(addquest).click();
	driver.findElement(openq).click();
	driver.findElement(quest).sendKeys("What are the types of automation testing");
	driver.findElement(score).sendKeys("10");
	driver.findElement(addquest).click();
	driver.findElement(openq).click();
	driver.findElement(quest).sendKeys("When is a good time to automate a test?");
	driver.findElement(score).sendKeys("10");
	driver.findElement(addquest).click();
	driver.findElement(openq).click();
	driver.findElement(quest).sendKeys("How do you choose a tool/framework for automated testing?");
	driver.findElement(score).sendKeys("10");
	driver.findElement(addquest).click();
	driver.findElement(openq).click();
	driver.findElement(quest).sendKeys("What are the different parts of a test automation framework?");
	driver.findElement(score).sendKeys("10");
	driver.findElement(addquest).click();

}


public boolean success_createtest()
{
	
    boolean regsuccess=driver.findElement(view).isDisplayed();
    //System.out.println("\nCourse created successfully");
	return regsuccess;
	

	
}

public String get_testname() {
	// TODO Auto-generated method stub
	return driver.findElement(Tname).getText();
}

}