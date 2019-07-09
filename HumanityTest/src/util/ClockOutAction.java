package util;

import org.openqa.selenium.WebDriver;

import pageObjects.Clock;


public class ClockOutAction {
	public static void Execute(WebDriver driver) {
		// TODO Auto-generated method stub
		 Clock.btn_ClockOut(driver).click();
	}
}
