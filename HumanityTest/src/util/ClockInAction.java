package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Clock;
import pageObjects.Dash;

public class ClockInAction {
	public static void Execute(WebDriver driver,String Note) {
		// TODO Auto-generated method stub
		 Dash.btn_Clock(driver).click();
		 Clock.btn_ClockIn(driver).click();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
		 Clock.field_Note(driver).sendKeys(Note);
		 Clock.btn_AddNote(driver).click();
	}

}
