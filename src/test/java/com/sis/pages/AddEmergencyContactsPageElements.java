package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddEmergencyContactsPageElements {
	
	@FindBy(xpath = "//div[@id='socialMediaDiv']//span[text()='Emergency Contacts']" )
	public WebElement emergencyTabelHeaderElement;
	
	@FindBy(xpath = "//div[@id='socialMediaDiv']//i[text()='add']")
	public WebElement plusButtonElement;
	
	@FindBy(id = "name")
	public WebElement nameElement;
	
	@FindBy(id = "relationship")
	public WebElement relationshipElement;
	
	@FindBy(id = "mobile_phone")
	public WebElement mobilePhoneElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButtoneElement;
	
	@FindBy(xpath = "//div[text()='Successfully Saved']")
	public WebElement successfullySavedMsgElement;
	
	
	
	public AddEmergencyContactsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
