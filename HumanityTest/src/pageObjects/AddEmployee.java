package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployee {
	private static WebElement element = null;

	 public static WebElement field_FirstFirstName(WebDriver driver){

	    element = driver.findElement(By.id("_asf1"));

	    return element;

	 }
	 
	 public static WebElement field_firstLastName(WebDriver driver){

		    element = driver.findElement(By.id("_asl1"));

		    return element;

	}
	 
	public static WebElement field_firstEmail(WebDriver driver){

		    element = driver.findElement(By.id("_ase1"));

		    return element;

	}
	
	public static WebElement btn_SaveEmployees(WebDriver driver) {
		 
		 element = driver.findElement(By.id("_as_save_multiple"));
		 
		 return element;
	 }
}
