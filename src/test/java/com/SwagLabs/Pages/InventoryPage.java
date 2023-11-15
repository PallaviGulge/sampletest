package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SwagLabs.Utility.Utility;

public class InventoryPage {
	
	private WebDriver driver;
	
	//initionlization
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By pcount=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	
	private By plable=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	
	private By cartbtn=By.xpath("//button[text()='Add to cart']");
	
	//methods
	
	public int getproductCount()
	{
		return driver.findElements(pcount).size();
		
	}
	
	public void getPtoductLables()
	{
		System.out.println("********Product Lables**********");
	    List<WebElement> list=driver.findElements(plable);
	    for(WebElement i: list)
	    {
	    	System.out.println(i.getText());
	    }
		

	}
	
	public void addProductToCart(String pname)
	{
		 List<WebElement> list=driver.findElements(plable);
		    for(WebElement i: list)
		    {
		    	if(i.getText().contains(pname))
		    	{
		    		i.click();
		    		break;
		    	}
		    }
		    Utility.getScreenshot(driver);
		    driver.findElement(cartbtn).click();
		    Utility.getScreenshot(driver);
		    System.out.println(pname+"Product added to Cart!");
	}
	
}
