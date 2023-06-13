package com.banking.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.pageObjects.BaseClass;
import com.banking.pageObjects.LoginPage;
import com.banking.testdata.TestdataProvider;
@Listeners(com.banking.pageObjects.TakeScreenshotListeners.class)
public class TC_Login_001 extends BaseClass 
{
	@Test
	public void logintest()
	{
		drv.get(url);
		logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(drv);
		
		lp.SetNmae(username);
		logger.info("username is enetered");
		lp.SetPassword(password);
		Reporter.log("password is enterred");
		lp.ClickLogin();
		
		if(drv.getTitle().equalsIgnoreCase("Guru99 bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("testacse is passed");
		}
		else
		{
			Assert.assertTrue(false);
		}
				
	}
	
	
}

