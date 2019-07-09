package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import assets.Constant;
import pageObjects.Clock;
import pageObjects.Dash;
import util.ClockOutAction;
import util.SignInAction;

public class ForthTestCase {
	//Only clock in and clock out
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 //max window
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--start-maximized");
	 driver = new ChromeDriver(options);
	 
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 
	//url
	 driver.get(Constant.URL);
	 
	 //sign in
	 SignInAction.Execute(driver,Constant.Username,Constant.Password);
	 
	 Dash.btn_Clock(driver).click();
	 Clock.btn_ClockIn(driver).click();
	
	 Thread.sleep(2000);
	 
	 ClockOutAction.Execute(driver);
	}
}
