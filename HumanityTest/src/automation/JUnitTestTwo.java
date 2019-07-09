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
import pageObjects.Clock;
import pageObjects.Dash;
import util.AddEmployeeAction;
import util.ClockOutAction;
import util.SignInAction;

public class JUnitTestTwo {
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
	public void test() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver = new ChromeDriver(options);
		 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		Assert.assertTrue(driver.getTitle().equals("Online Employee Scheduling Software - Humanity"));
		
		SignInAction.Execute(driver,Constant.Username,Constant.Password);
		 
		System.out.println("Uspesno ste ulogovani");
		
		Dash.btn_Clock(driver).click();
		Clock.btn_ClockIn(driver).click();
		
		Assert.assertEquals(driver.findElement(By.id("tc_tl_co")), driver.findElement(By.partialLinkText("Clock out")));
		
		Thread.sleep(1000);
		 
		ClockOutAction.Execute(driver);
		
		Thread.sleep(1000);
		
		Assert.assertEquals(driver.findElement(By.id("tc_tl_ci")), driver.findElement(By.partialLinkText("Clock in")));
	}
	
	@Test
	public void test2() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver = new ChromeDriver(options);
		 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		SignInAction.Execute(driver,Constant.Username,Constant.Password);
		 
		 System.out.println("Uspesno ste ulogovani");
		 
		 Thread.sleep(3000);
		 
		 AddEmployeeAction.Execute(driver, "", ConstantEmployee.LastName, ConstantEmployee.Email);
		 
		 Assert.assertTrue("Nije prazan field", driver.findElement(By.id("_asf1")).getText().isEmpty());
	}
}
