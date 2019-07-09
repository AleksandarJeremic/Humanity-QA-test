package util;

import org.openqa.selenium.WebDriver; 
import pageObjects.Home_Page;
import pageObjects.LoginForma;

public class SignInAction {

	public static void Execute(WebDriver driver,String Username, String Password) {
		// TODO Auto-generated method stub
		 Home_Page.btn_Login(driver).click();
		 LoginForma.field_Username(driver).sendKeys(Username);
		 LoginForma.field_Password(driver).sendKeys(Password);
		 LoginForma.btn(driver).click();
	}

}
