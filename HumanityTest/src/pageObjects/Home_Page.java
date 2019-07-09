package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebElement element = null;

	 public static WebElement btn_Login(WebDriver driver){

	    element = driver.findElement(By.linkText("LOGIN"));

	    return element;

	 }
	 
	 public static WebElement btn_Logout(WebDriver driver) {
		 
		 driver.findElement(By.cssSelector("#wrap_us_menu > i")).click();
		 element = driver.findElement(By.linkText("Sign Out"));
		 
		 return element;
	 }
}
