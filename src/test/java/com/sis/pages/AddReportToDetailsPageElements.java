package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddReportToDetailsPageElements {
	
	@FindBy(xpath = "//div[@class='not-a-card']//i[text()='add']")
	public WebElement plusBtnElement;
	
	@FindBy(xpath = "//img[@data-tooltip='Add Supervisor']")
	public WebElement supervisorIconElement;
	
	@FindBy(xpath = "//img[@data-tooltip='Add Subordinate']")
	public WebElement subordinateIconElement;
	
	@FindBy(id = "selectedEmployee_value")
	public WebElement nameInputElement;
	
	@FindBy(xpath = "//div[@class='input-group-append']//i[text()='arrow_drop_down']")
	public WebElement dropdownIconElement;
	
	@FindBy(xpath = "//div[@id='bs-select-1']//li/a[@id='bs-select-1-1']")
	public WebElement selectDirectorElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveBtnElement;
	
	@FindBy(xpath = "//div[text()='Required']")
	public WebElement requiredErrorElement;
	
	public AddReportToDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
