package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Staff {
		private static WebElement element = null;

		 public static WebElement btn_addEmployee(WebDriver driver){

		    element = driver.findElement(By.id("act_primary"));

		    return element;

		 }
}
