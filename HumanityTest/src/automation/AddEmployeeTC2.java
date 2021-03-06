package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import assets.Constant;
import assets.ConstantEmployee;
import pageObjects.Home_Page;
import util.AddEmployeeAction;
import util.SignInAction;

public class SecondTestCase {

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
		 
		 AddEmployeeAction.Execute(driver, ConstantEmployee.FirstName, ConstantEmployee.LastName, ConstantEmployee.Email);
		 
		 System.out.println("Uspesno uveden novi employee");
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
		 Home_Page.btn_Logout(driver).click();
		 
		 System.out.println("Uspesno ste izlogovani");
	}

}
