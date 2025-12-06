package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddEmployeePageElements {
	

	@FindBy(id = "first-name-box")
	public WebElement firstNameElement;
	
	@FindBy(id = "last-name-box")
	public WebElement lastNameElement;
	
	@FindBy(id = "employeeId")
	public WebElement idElement;
	
	@FindBy(id = "location")
	public WebElement locationDropdownElement;
	
//	@FindBy(xpath = "//label[@for='hasLoginDetails']")
//	public WebElement loginDetalsSwitchElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButtonElement;
	
	@FindBy(xpath =  "//button[text()='Cancel']")
	public WebElement cancelButtonElement;
	
	@FindBy(xpath = "//div[text()='Successfully Saved']")
	public WebElement successfullySavedMsgElement;
	
	@FindBy(xpath = "//span[text()='Required']")
	public WebElement emptyErrorMsgElement;
	
	

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
