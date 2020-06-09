package project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_CAREFIR_001 extends BaseClass {
	
	
	  @Test (priority= 1) public void varifytitle() { String titleofthepage=
	  driver.getTitle(); String expectedtitle=
	  "CareFirst | Medical, Dental and Vision Insurance in Maryland, the District of Columbia & Northern Virginia"
	  ; Assert.assertEquals(titleofthepage , expectedtitle ); System.out.println(
	  titleofthepage ); }
	  
	  @Test(priority=2) public void closeminiwindoww() {
	  driver.findElement(By.xpath("//button[@class='close home-m-close']")).click(); }
	  
	  @Test (priority=3)
	  
	  public void varifylink( ) { WebElement indfamilik=
	  driver.findElement(By.xpath("//*[contains(text(),'Coverage')]"));
	  
	  indfamilik.click(); }
	  
	  
	  
	  @Test (priority=4) public void clickonfamilink (){
	  
	  driver.findElement(By.xpath("//a[@title='Individual & Family Plans' ] "
	  )).click(); String title= driver.getTitle(); String url=
	  driver.getCurrentUrl(); System.out.println(title + " " + url); }
	  
	  @Test(priority=5) public void varifyquotebtn() {
	  
	  
	  
	  WebElement quotebtn=
	  driver.findElement(By.xpath("//*[contains(text(),'Get a Quote')]"));
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();",quotebtn);
	  quotebtn.click(); String qutitle= driver.getTitle(); String quurl=
	  driver.getCurrentUrl(); System.out.println(qutitle + " " + quurl); }
	 
	
   @Test (priority=5, dataProvider= "zipcode", description= "This is data driven testing for zipcode")
public void verifyipcodetextbox(String zip) {
	driver.findElement(By.name("zipCode")).sendKeys(zip);;
	
}
   @DataProvider(name="zipcode")
	public Object [][] getdata() {
		Object[][] data = new Object[1][1];
		data[0][0]= "20783";
	//data[1][0]= "8888";
		//data[2][0]= "30032";
		return data;}

@Test (priority=6)
public void ShopByGlancelik() {
driver.findElement(By.partialLinkText("Plans at A Glance")).click();
WebElement element= driver.findElement(By.xpath("//div[@id='closecovid19PopUp']"));
element.click();
}
@Test(priority=6)
public void Fillinfamandindplan() {
	/*WebElement element =driver.findElement(By.xpath("//*[contains(@name,'census.zipCode')]"));
	WebDriverWait wait= new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys("20913");*/
	driver.findElement(By.xpath("//*[contains(@name,'subsidyFlow')]  ")).click();
}}