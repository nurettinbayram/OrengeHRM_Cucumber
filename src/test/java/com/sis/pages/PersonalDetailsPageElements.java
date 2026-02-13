package com.sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class PersonalDetailsPageElements {
	
	@FindBy(id = "employeeId")
	public WebElement employeeIdElement;
	
	@FindBy(id = "firstName")
	public WebElement firstNamElement;
	
	@FindBy(id = "lastName")
	public WebElement lastNameElement;
	
	@FindBy(id = "otherId")
	public WebElement otherIdElement;
	
	@FindBy(id = "emp_gender")
	public WebElement genderDropdownElement;
	
	@FindBy(id = "emp_marital_status")
	public WebElement maritalStatusDropdownElement;
	
	@FindBy(xpath = "//input[@id='emp_birthday']/following-sibling::span//i")
	public WebElement iconDateOfBirthElement;
	
	@FindBy(xpath = "//input[@id='emp_birthday']/following-sibling::span//select[@title='Select a month']")
	public WebElement dateOfBirthMonthElement;
	
	@FindBy(xpath = "//input[@id='emp_birthday']/following-sibling::span//select[@title='Select a year']")
	public WebElement dateOfBirthYearElement;
	
	@FindBy(xpath = "//input[@id='emp_birthday']/following-sibling::span//table//tbody//td")
	public List<WebElement> listOfDaysDateOfBirthElements;
		
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span//i")
	public WebElement iconLicenseExpiryDateElement;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span//select[@title='Select a month']")
	public WebElement licenseExpiryMonthElement;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span//select[@title='Select a year']")
	public WebElement licenseExpiryYearElement;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span//table//tbody//td")
	public List<WebElement> listOfDaysLicenseExpiryElements;
	
	@FindBy(id = "nation_code")
	public WebElement nationalityDropdownElement;
	
	@FindBy(id = "licenseNo")
	public WebElement licenceNoElement;
	
	@FindBy(id = "nickName")
	public WebElement nickNameElement;
	
	@FindBy(id = "militaryService")
	public WebElement militaryServiceElement;
	
	@FindBy(xpath = "//label[@for='smoker']")
	public WebElement smokerCheckboxElement; 
	
	@FindBy(id = "eeo_race_ent")
	public WebElement raceOrEthnicityElement;
	
	@FindBy(xpath = "//form[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement saveButtonElement;
	
	
	@FindBy(css = ".toast-message")
	public WebElement successPopUpElement;
	
	//---------------More-----------------
	
	@FindBy(id = "top-menu-trigger")
	public WebElement moreLinkElement;
	
	@FindBy(xpath = "//ul[@id='top-menu-overflow']//span[text()='Contact Details']")
	public WebElement contactDetailsLinkElement;
	
	@FindBy(xpath = "//ul[@id='top-menu-overflow']//span[text()='Social Media Details']")
	public WebElement socialMediaDetailsElement;
	
	@FindBy(xpath = "//ul[@id='top-menu-overflow']//span[text()='Emergency Contacts']")
	public WebElement emergencyContactsElement;
	
	@FindBy(xpath = "//ul[@id='top-menu-overflow']//span[text()='Dependents']")
	public WebElement dependentsLink;
	
	@FindBy(xpath = "//ul[@id='top-menu-overflow']//span[text()='Immigration']")
	public WebElement immigrationLink;
	
	
	
	
	
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
