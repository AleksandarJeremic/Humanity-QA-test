package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Clock;

public class SetPosition {
	public static void Execute(WebDriver driver) {
		
		 Clock.btn_SetPosition(driver).click();
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 
		 Clock.drp_Choice(driver).click();
		 Clock.btn_Update(driver).click();
		 
	}

}
