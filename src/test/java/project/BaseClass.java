package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public static String url= "https://individual.carefirst.com/individuals-families/home.page#";
	public static String url2= "http://carefirst.inshealth.com/?allid=CAR27748";
	
	
	
	
	@BeforeSuite

public void setup ( ) {
	
	 System.setProperty("webdriver.chrome.driver", "/Users/mistreaderaw/Downloads/chromedriver");
	driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(url);
	//
}


/*
 * @AfterSuite
 * 
 * public void theardown() { driver.quit(); }
 */
 
}
