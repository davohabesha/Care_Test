package project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

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
	
	@Test (priority= 1)
	public void varifytitle() {
	String titleofthepage= driver.getTitle();
	String expectedtitle= "CareFirst | Medical, Dental and Vision Insurance in Maryland, the District of Columbia & Northern Virginia";
	AssertJUnit.assertEquals(titleofthepage , expectedtitle );
	System.out.println( titleofthepage );
}
	
	@Test(priority=2)	
	public void closechildwindoww() {
		String currentwindow= driver.getWindowHandle();
		System.out.println(currentwindow);
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows);
		driver.switchTo().window(currentwindow);
	   driver.findElement(By.xpath("//button[@class='close']")).click();
	}
	   
	   @Test (priority=3)
	   
	   public void varifylink( ) {
		WebElement indfamilik= driver.findElement(By.xpath("//*[contains(text(),'Coverage')]"));
		
		indfamilik.click();
		
	}
	@Test (priority=4)
	public void clickonfamilink (){
		
		driver.findElement(By.xpath("//a[@title='Individual & Family Plans' ] " )).click();
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		System.out.println(title +  " " + url);
	}
@Test(priority=5)
public void varifyquotebtn() {
		
        
	
	     WebElement quotebtn= driver.findElement(By.xpath("//*[contains(text(),'Get a Quote')]"));
		 JavascriptExecutor js =(JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView();",quotebtn);
         quotebtn.click();
		String qutitle= driver.getTitle();
		String quurl= driver.getCurrentUrl();
		System.out.println(qutitle +  " " + quurl); }
	
}