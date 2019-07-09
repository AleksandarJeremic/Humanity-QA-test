package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import assets.Constant;
import assets.ConstantNote;
import util.ClockInAction;
import util.ClockOutAction;
import util.SignInAction;

public class FifthTestCase {
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
		 
		 System.out.println("Uspesno ste ulogovani");
		 
		 ClockInAction.Execute(driver, ConstantNote.Note1);
		 
		 System.out.println("ubacena nota");
		
		 Thread.sleep(2000);
		 
		 ClockOutAction.Execute(driver);
		 
//		 Home_Page.btn_Logout(driver).click();
	}
}
