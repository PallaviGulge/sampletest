package com.SwagLabs.TestPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyOrderSummary() {
	  
	  op.getDetails();
  }
  
  @Test(priority=2)
  public void verifyCompleteOrder() {
	  
	  op.doFinish();
  }
  //After this we ceratedxml file and run it - it will run complete suite
  
}
