package automation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import assets.Constant;
import assets.ConstantEmployee;
import util.AddEmployeeAction;
import util.SignInAction;

public class ThirdTestCase {

	public static void main(String[] args) {
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
		 
		 AddEmployeeAction.Execute(driver, "", ConstantEmployee.LastName, ConstantEmployee.Email);
		 
		 
		 System.out.print("warning");
	}
}
