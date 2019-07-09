package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForma {
	private static WebElement element = null;

	 public static WebElement field_Username(WebDriver driver){

	    element = driver.findElement(By.id("email"));

	    return element;

	 }
	 
	 public static WebElement field_Password(WebDriver driver){

		    element = driver.findElement(By.id("password"));

		    return element;

	}
	 
	public static WebElement btn(WebDriver driver){

		    element = driver.findElement(By.name("login"));

		    return element;

	}
}

