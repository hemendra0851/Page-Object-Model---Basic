/**
 * 
 */
package com.flipkart.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.Config.StartBrowser;
import com.flipkart.Pages.Login;

/**
 * @author 612946
 *
 */
public class VerifyLogin extends StartBrowser{
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
	    System.out.println("Test name: " + method.getName());       
	}
	
	@Test
	public void VerifyValidLogin()
	{
		WebDriver driver = getWebDriver();
		
		Login login = new Login(driver);
		
		login.LoginToFB(OR.getProperty("username"), OR.getProperty("password"));

		driver.quit();
	}

}
