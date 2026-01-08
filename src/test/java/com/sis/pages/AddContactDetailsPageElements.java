package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddContactDetailsPageElements {
	
	
	@FindBy(id = "street1")
	public WebElement addressStreat1Element;
	
	@FindBy(id = "city")
	public WebElement cityElement;
	
	@FindBy(id = "emp_zipcode")
	public WebElement zipCodeElement;
	
	@FindBy(id = "emp_mobile")
	public WebElement mobilePhoneElement;
	
	@FindBy(id = "emp_work_email")
	public WebElement workEmailElement;
	
	@FindBy(id = "emp_oth_email")
	public WebElement otherEmailElement;
	
	@FindBy(id = "country")
	public WebElement countryDropdownElement;
	
	@FindBy(id = "province")
	public WebElement stateProvincDropdownElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButtonElement;
	
	@FindBy(id = "toast-container")
	public WebElement pupUpMsgElement;
	

	
	
	public AddContactDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
