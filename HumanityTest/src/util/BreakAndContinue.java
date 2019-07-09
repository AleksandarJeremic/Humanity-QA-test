package util;

import org.openqa.selenium.WebDriver;

import pageObjects.Clock;
import pageObjects.Dash;

public class BreakAndContinue {
	public static void Execute(WebDriver driver) throws InterruptedException {
		
		 Dash.btn_Clock(driver).click();
		 Clock.btn_ClockIn(driver).click();
		 Clock.btn_Break(driver).click();
		 System.out.println("kliknut brake");
		 
		 Thread.sleep(2000);
		 
		 Clock.btn_ContinueShift(driver).click();
		 
	}

}
