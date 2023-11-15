package com.SwagLabs.TestPage;

import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyCheckout() {
	  
	  cp.doContinue("Pallavi", "Gulge", "431001");
  }
}
