package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.AddEmployee;
import pageObjects.Dash;
import pageObjects.Staff;

public class AddEmployeeAction {
	public static void Execute(WebDriver driver,String FirstName, String LastName, String Email) {
		// TODO Auto-generated method stub
		
		 Dash.btn_Staff(driver).click();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		 Staff.btn_addEmployee(driver).click();
		 AddEmployee.field_FirstFirstName(driver).sendKeys(FirstName);
		 AddEmployee.field_firstLastName(driver).sendKeys(LastName);
		 AddEmployee.field_firstEmail(driver).sendKeys(Email);
		 AddEmployee.btn_SaveEmployees(driver).click();
	}
}
