package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass{

	// first we need to define /create object repository in the page -page factory
	// it is nothing but identifying all emenets in the page 
	
	@FindBy(name="email")
	WebElement email_Address;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'submit button')]")
	WebElement login_Btn ;
	
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement Forgot_your_password ;
	
	
	//creating method
	
	
	
}
