package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class DashbordPageElements {
	
	@FindBy(id = "account-name")
	public WebElement accountNamElement;
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement PIMLinkElement;
	
	@FindBy(xpath = "//span[text()='Add Employee']")
	public WebElement addEmployeeElement;
	
	
	
	public DashbordPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
