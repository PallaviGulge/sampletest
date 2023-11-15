package com.SwagLabs.TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyCurrentUrl() {
	  
	  String actUrl=lp.getAppurl();
	  Assert.assertTrue(actUrl.contains("demo"), "Url is not valid");
	  System.out.println("Application Url is :"+actUrl);
	  
  }
  
  @Test(priority=2)
  public void verifyTitle() {
	  
	  System.out.println("Application Title is :"+lp.getAppTitle());
  }
  

  
  
  @Test(priority=3)
  public void VerifyLogin() {
	  
	  lp.doLogin("standard_user", "secret_sauce");
  }
  
}
