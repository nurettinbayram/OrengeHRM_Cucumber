package com.sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddQualificationsPageElements {

	// --------------------------WORK EXPERIENCE--------------------------
	@FindBy(xpath = "//i[@class = 'material-icons']/span")
	public WebElement plusButtonElement;

	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[text()='Work Experience']")
	public WebElement workExperiencElement;

	@FindBy(id = "employer")
	public WebElement companyElement;

	@FindBy(id = "jobtitle")
	public WebElement jobtitleElement;

	@FindBy(xpath = "//label[@for='creditable']")
	public WebElement creditableElement;

	@FindBy(id = "comments")
	public WebElement commentsElement;

	@FindBy(xpath = "//input[@id='from_date']/following-sibling::div//i")
	public WebElement fromCalanderIconElement;

	@FindBy(xpath = "//input[@id='to_date']/following-sibling::div//i")
	public WebElement toCalanderIconElement;

	@FindBy(xpath = "//input[@id='from_date']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement fromCalenderMonthElement;

	@FindBy(xpath = "//input[@id='from_date']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement fromCalenderYearElement;

	@FindBy(xpath = "//input[@id='to_date']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement toCalenderMonthElement;

	@FindBy(xpath = "//input[@id='to_date']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement toCalenderYearElement;

	@FindBy(xpath = "//input[@id='from_date']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> fromCalenderElements;

	@FindBy(xpath = "//input[@id='to_date']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> toCalenderElements;

	@FindBy(id = "modal-save-button")
	public WebElement saveButtonElement;

	@FindBy(xpath = "(//list)[1]//tr[1]//td[2]//span")
	public WebElement workTableCompanyElement;
	
	@FindBy(id = "from_date")
	public WebElement fromDateInputElement;
	
	@FindBy(id = "to_date")
	public WebElement toDateInputElement;
	
	@FindBy(xpath = "(//list[@listdata='listData'])[1]")
	public WebElement workExpListElement;
	
	

	// --------------------------EDUCATION--------------------------
	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[text()='Education']")
	public WebElement educationLinkElement;

	@FindBy(id = "educationId")
	public WebElement lavelDropdownElement;

	@FindBy(id = "institute")
	public WebElement instituteElement;

	@FindBy(id = "major")
	public WebElement majorElement;

	@FindBy(id = "year")
	public WebElement yearElement;

	@FindBy(id = "score")
	public WebElement scoreElement;

	@FindBy(xpath = "//input[@id='startDate']/following-sibling::div//i")
	public WebElement fromEducationCalanderIconElement;

	@FindBy(xpath = "//input[@id='startDate']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement fromEducationCalenderMonthElement;

	@FindBy(xpath = "//input[@id='startDate']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement fromEducationCalenderYearElement;

	@FindBy(xpath = "//input[@id='startDate']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> fromEducationCalenderElements;

	@FindBy(xpath = "//input[@id='endDate']/following-sibling::div//i")
	public WebElement toEducationCalanderIconElement;

	@FindBy(xpath = "//input[@id='endDate']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement toEducationCalenderMonthElement;

	@FindBy(xpath = "//input[@id='endDate']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement toEducationCalenderYearElement;

	@FindBy(xpath = "//input[@id='endDate']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> toEducationCalenderElements;
	
	@FindBy(xpath = "(//list)[2]//tr[1]//td[2]//span")
	public WebElement educationTableElement;
	
	@FindBy(id = "startDate")
	public WebElement eduStartDatElement;

	@FindBy(id = "endDate")
	public WebElement eduEndDatElement;
	
	@FindBy(xpath = "(//list[@listdata='listData'])[2]")
	public WebElement educationListElement;
	
	//-------------------------------------SKILL-------------------------------------
	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[text()='Skill']")
	public WebElement skillLinkElement;
	
	@FindBy(id = "skillId")
	public WebElement skillDropdownElement; //visible text --> Programming
	
	@FindBy(id = "years_of_exp")
	public WebElement yearsOfExpElement;
	
	@FindBy(id = "comments")
	public WebElement commentsSkillElement;
	
	@FindBy(xpath = "(//list)[3]//tr[1]//td[2]//span")
	public WebElement skillTableElement;
	
	@FindBy(xpath = "(//list[@listdata='listData'])[3]")
	public WebElement skillsListElement;
	
	//-------------------------------Landuage-----------------------------
	
	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[text()='Language']")
	public WebElement languageLinkElement;
	
	@FindBy(id = "langId")
	public WebElement languageDropdownElement;
	
	@FindBy(xpath = "//select[@name='fluency']")
	public WebElement skillLanguageDropdownElement;
	
	@FindBy(id = "competency")
	public WebElement fluencyLavelDropdownElement;
	
	@FindBy(xpath = "(//list)[4]//tr[1]//td[2]//span")
	public WebElement languageTableElement;
	
	//-------------------------------License-----------------------------
	
	@FindBy(xpath = "//ul[@id='additem-options-dropdown-qualifications']//a[text()='License']")
	public WebElement licenseLinkElement;
	
	@FindBy(id = "licenseId")
	public WebElement licenseTypElement; 
	
	@FindBy(id = "licenseNo")
	public WebElement licenseNoElement;
	
	@FindBy(xpath = "//input[@id='licenseIssuedDate']/following-sibling::div//i")
	public WebElement issuedDataCalanderIconElement;

	@FindBy(xpath = "//input[@id='licenseIssuedDate']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement issuedDataCalenderMonthElement;

	@FindBy(xpath = "//input[@id='licenseIssuedDate']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement issuedDataCalenderYearElement;

	@FindBy(xpath = "//input[@id='licenseIssuedDate']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> issuedDataCalenderDaysElements;
	
	@FindBy(xpath = "//input[@id='licenseExpiryDate']/following-sibling::div//i")
	public WebElement expiryDayCalanderIconElement;

	@FindBy(xpath = "//input[@id='licenseExpiryDate']/parent::div//following-sibling::div//select[@title='Select a month']")
	public WebElement expiryDayCalenderMonthElement;

	@FindBy(xpath = "//input[@id='licenseExpiryDate']/parent::div//following-sibling::div//select[@title='Select a year']")
	public WebElement expiryDayCalenderYearElement;

	@FindBy(xpath = "//input[@id='licenseExpiryDate']/parent::div//following-sibling::div//tbody//td//div[contains(@class, 'picker__day--infocus')]")
	public List<WebElement> expiryDayCalenderDaysElements;
	
	@FindBy(xpath = "(//list)[5]//tr[1]//td[2]//span")
	public WebElement licenseTableElement;
	
	//-------------------------------------END-----------------------------------
	public AddQualificationsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
