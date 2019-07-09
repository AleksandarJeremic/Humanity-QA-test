package automation;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import assets.Constant;
import assets.ConstantEmployee;
import util.AddEmployeeAction;
import util.SignInAction;

public class JUnitTestOne {
	WebDriver driver = null;

	@Before
	public void setup() {
		WebDriver driver = new ChromeDriver();
		
	}

	@After
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void test() {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver = new ChromeDriver(options);
		 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		Assert.assertTrue(driver.getTitle().equals("Online Employee Scheduling Software - Humanity"));
		
		SignInAction.Execute(driver,Constant.Username,Constant.Password);
		 
		System.out.println("Uspesno ste ulogovani");
	}
	
	@Test
	public void test2() {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver = new ChromeDriver(options);
		 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		SignInAction.Execute(driver,Constant.Username,Constant.Password);
		 
		 System.out.println("Uspesno ste ulogovani");
		 
		 AddEmployeeAction.Execute(driver, "", ConstantEmployee.LastName, ConstantEmployee.Email);
		 
		 Assert.assertTrue("Nije prazan field", driver.findElement(By.id("_asf1")).getText().isEmpty());
	}
}
