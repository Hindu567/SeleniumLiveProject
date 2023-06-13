package com.banking.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TakeScreenshotListeners extends BaseClass implements ITestListener 

{
//WebDriver driver;
	public void onTestSuccess(ITestResult result)
	{
		 File srcfile = ((TakesScreenshot)drv)
                 .getScreenshotAs(OutputType.FILE);
		 Date d= new Date();
		 String timestamp=d.toString().replace(":", "_").replace(" ", "_");
		 //File Dest=new File("C:/dev/workspace/Selenium/Screenshots/" +"_"+ timestamp + "_passed.png");
		// File Dest=new File("C:/dev/workspace/Selenium/Screenshots/" +this.getClass().getName()+"_"+ timestamp + "_passed.png");
		 
		 File Dest=new File("C:/dev/workspace/Selenium/Screenshots/" +result.getMethod().getMethodName()+"_"+ timestamp + "_passed.png");
		 try {
			FileUtils.copyFile(srcfile, Dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) 
	{
		 File srcfile = ((TakesScreenshot)drv)
                 .getScreenshotAs(OutputType.FILE);
		 Date d= new Date();
		 String timestamp=d.toString().replace(":", "_").replace(" ", "_");
		 File Dest=new File("C:/dev/workspace/Selenium/Screenshots/" +result.getMethod().getMethodName()+"_"+ timestamp + "_failed.png");
		 try {
			FileUtils.copyFile(srcfile, Dest);
		} catch (IOException e) {
			e.printStackTrace();
		}



}
}
