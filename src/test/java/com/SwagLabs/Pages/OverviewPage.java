package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class OverviewPage {
	
	private WebDriver driver;
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By productDetails=By.id("checkout_summary_container");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2");
	
	//methods
	public void getDetails()
	{
		String text=driver.findElement(productDetails).getText();
		System.out.println("Product order details are :");
		System.out.println(text);
		
	}
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
	    Utility.getScreenshot(driver);
		System.out.println("Final result :"+driver.findElement(msg).getText());
	}

}
