package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;


public class LoginPageElements {
	
	@FindBy(id = "txtUsername")
	public WebElement usernamElement;
	
	@FindBy(id = "txtPassword")
	public WebElement passwordElement;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButtonElement;
	
	@FindBy(id = "account-name")
	public WebElement accountNamElement;
	
	@FindBy(id = "txtPassword-error")
	public WebElement txtPasswordErrorElement;
	
	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
