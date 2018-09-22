/**
 * 
 */
package com.flipkart.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.Config.*;
import com.flipkart.Pages.Login;

/**
 * @author 612946
 *
 */
public class VerifyLoginBoxClose extends StartBrowser{
	
	WebDriver driver;
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
	    System.out.println("Test name: " + method.getName());       
	}

	@Test
	public void VerifyClickClose()
	{
		driver = getWebDriver();
		
		Login login = new Login(driver);
	
		login.closeLoginDialogClick();

		driver.quit();
	}
	
	@Test
	public void VerifyEscClose()
	{

		driver = getWebDriver();
		
		Login login = new Login(driver);
	
		login.closeLoginDialogEsc();
		
		driver.quit();
	}
	
	
}
