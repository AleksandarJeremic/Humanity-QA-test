package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Clock {
	private static WebElement element = null;
	
	 public static WebElement btn_ClockIn(WebDriver driver){

	    element = driver.findElement(By.id("tc_tl_ci"));

	    return element;

	 }

	 public static WebElement field_Note(WebDriver driver){

	    element = driver.findElement(By.id("tc_tl_no"));

	    return element;

	 }
	 
	 public static WebElement btn_AddNote(WebDriver driver) {
		 
		 element = driver.findElement(By.id("tc_tl_no_a"));
		 
		 return element;
	 }
	 
	 public static WebElement btn_ClockOut(WebDriver driver){

		    element = driver.findElement(By.linkText("Clock out"));

		    return element;

	}
	 
	 public static WebElement btn_Break(WebDriver driver){

		    element = driver.findElement(By.id("tc_tl_br_s"));

		    return element;

	}
	 
	 public static WebElement btn_SetPosition(WebDriver driver){

		    element = driver.findElement(By.id("tc_tl_po_b"));

		    return element;

	}
	
//	 public static WebElement drp_Role(WebDriver driver){
//
//		    element = driver.findElement(By.id("tc_tl_po_s"));
//
//		    return element;
//
//	}
	 
	 public static WebElement drp_Choice(WebDriver driver){
		 	
//		 	driver.findElement(By.id("tc_tl_po_s")).click();
		 	Select listbox = new Select(driver.findElement(By.id("tc_tl_po_s")));
		 	listbox.getFirstSelectedOption();

		    return element;

	}
	 
	 public static WebElement btn_Update(WebDriver driver){

		    element = driver.findElement(By.linkText("Update"));

		    return element;

	}
	 
	 public static WebElement btn_ContinueShift(WebDriver driver){

		    element = driver.findElement(By.id("tc_tl_br_e"));

		    return element;

	}
}
