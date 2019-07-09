package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dash {
	private static WebElement element = null;

	 public static WebElement btn_Staff(WebDriver driver){

	    element = driver.findElement(By.id("sn_staff"));

	    return element;

	 }
	 
	 public static WebElement btn_Clock(WebDriver driver){

		    element = driver.findElement(By.id("sn_timeclock"));

		    return element;

	}
}
