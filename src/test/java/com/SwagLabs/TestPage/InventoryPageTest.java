package com.SwagLabs.TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyProductCount() {
	 int count= ip.getproductCount();
	 Assert.assertEquals(count, 6, "Product count is not matched!");
	 System.out.println("Product count is matched!..Total Product are :"+count);
	
  }
  
  @Test(priority=2)
  public void verifyProductLables()
  {
	  ip.getPtoductLables();
  }
  
  @Test(priority=3)
  public void verifyAddToCart()
  {
	  ip.addProductToCart("Test.allTheThings() T-Shirt (Red)");
  }
}
