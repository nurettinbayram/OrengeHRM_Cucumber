package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class EmployeeListPageElements {
	

	@FindBy(xpath = "//li[text()='Employee List']")
	public WebElement titleOfEmployeeListElement;
	
	
	
	

	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
