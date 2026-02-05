package com.sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddDependencyPageElements {
	
	@FindBy(xpath = "//div[@id='socialMediaDiv']//i[text()='add']")
	public WebElement plusButtonElement;
	
	@FindBy(id = "name")
	public WebElement nameElement;
	
	@FindBy(xpath = "//input[@id='date_of_birth']/following-sibling::div//button//i")
	public WebElement dateOfBirthIconElement;
	
	@FindBy(xpath = "//input[@id='date_of_birth']/following-sibling::div//select[@title='Select a year']")
	public WebElement dateOfBirthYearDDElement;
	
	@FindBy(xpath = "//input[@id='date_of_birth']/following-sibling::div//select[@title='Select a month']")
	public WebElement dateOfBirthMonthDDElement;
	
	@FindBy(xpath = "//input[@id='date_of_birth']/following-sibling::div//tbody//tr//td")
	public List<WebElement> dateOfBirthDaysElementList;
	
	@FindBy(id = "relationship_type")
	public WebElement relationshipDropdownElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButtoneElement;
	
	
	
	public AddDependencyPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
