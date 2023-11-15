package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLabs.Utility.Utility;



public class LoginPage {
	
	//Encapsulation = data+methods
	
	private WebDriver driver;
	
	//initialization 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	
	public void doLogin(String un,String pws)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pws);
	    Utility.getScreenshot(driver);
		driver.findElement(loginbtn).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login Fail");
		System.out.println("User Login Completed!");
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppurl()
	{
		return driver.getCurrentUrl();
	}

}
