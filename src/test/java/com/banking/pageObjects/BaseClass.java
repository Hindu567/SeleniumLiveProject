package com.banking.pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.banking.utilities.ReadConfig;

public class BaseClass 
{
	
	ReadConfig read = new ReadConfig();
	public String url=read.getApplicationurl();
	public String username=read.getusername();
	public String password=read.getpassword();
	
	
//public String url="https://demo.guru99.com/v4/index.php";
//public String username="mngr508020";
//public String password="hehApum";
public static WebDriver drv;
public static Logger logger;

@BeforeClass
public void SetUp()
{
	 drv=new FirefoxDriver();
	 logger= Logger.getLogger("BaseClass");
	 PropertyConfigurator.configure("Log4j.properties");
	 
	}
@AfterClass
public void teardown() throws InterruptedException
{
	Thread.sleep(1000);
	drv.close();
	}
}
