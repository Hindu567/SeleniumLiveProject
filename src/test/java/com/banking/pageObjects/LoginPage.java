package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(name="uid") WebElement uname;
@FindBy(name="password") WebElement pwd;
@FindBy(name="btnLogin") WebElement lbtn;

public void SetNmae(String name) {uname.sendKeys(name);}
public void SetPassword(String password)
								{pwd.sendKeys(password);}
public void ClickLogin() {lbtn.click();}
}
