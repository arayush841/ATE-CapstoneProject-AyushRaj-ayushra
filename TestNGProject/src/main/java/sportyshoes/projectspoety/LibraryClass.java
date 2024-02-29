package sportyshoes.projectspoety;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class LibraryClass {
	WebDriver driver;
   public void InitDriver(WebDriver driver) {
    	this.driver = driver;
   }

   public void launchApp(String url) {
	driver.get(url);
	System.out.println("The app is launched successfully");
   }
   public void TypeSomthing(String selector ,String value) {
	driver.findElement(By.xpath(selector)).sendKeys(value);
   }
   public void clickOn(String selector) {
	driver.findElement(By.xpath(selector)).click();
   }
   public void checkTitle(String expectedTitle) {
	   Assert.assertEquals(driver.getTitle(), expectedTitle, "Page title doesn't match expected title");
   }
   public void isdisplaiedClick(String loc) {
	   try {
	   if(driver.findElement(By.xpath(loc)).isDisplayed()) {
		   driver.findElement(By.xpath(loc)).click();
		   System.out.println("Element is displayed.");
	   }
	   }
	   catch (NoSuchElementException e) {
	        System.out.println("Element is not displayed.");
	    }
   }
  
}

