/**
 * 
 */
package com.flipkart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.flipkart.Config.StartBrowser;

/**
 * @author 612946
 *
 */
public class Login extends StartBrowser{
	
	WebDriver driver;
	
	By username = By.xpath("//input[@class='_2zrpKA']");
	By password = By.xpath("//input[@class='_2zrpKA _3v41xv']");
	By loginBtn = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	By closeIco = By.xpath("//button[@class='_2AkmmA _29YdH8']");
	
	//Constructor
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}

	//Verify Login
	public void LoginToFB(String uid, String pass)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}
	

	//Close Login Dialog Box
	public void closeLoginDialogClick()
	{
		driver.findElement(closeIco).click();
	}
	
	public void closeLoginDialogEsc()
	{
		driver.findElement(closeIco).sendKeys(Keys.ESCAPE);
	}
}
