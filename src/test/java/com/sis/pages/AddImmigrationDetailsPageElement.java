package com.sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddImmigrationDetailsPageElement {
	
	@FindBy(xpath = "//div[@data-tooltip='Add Immigration']")
	public WebElement plusButtonElement;
	
	@FindBy(xpath = "//label[text()='Visa']")
	public WebElement documentVisaElement;
	
	@FindBy(id = "number")
	public WebElement numberElement;
	
	@FindBy(xpath = "//form[@name='oxdModalForm']//i[text()='arrow_drop_down']")
	public WebElement issuedByDropdownIconElement;
	
	// ---------------------------issuedDateCalender-------------------------------------
	@FindBy(xpath = "//input[@id='issuedDate']/following-sibling::div//i[text()='date_range']")
	public WebElement issuedDateCalenderIconElement;
	
	@FindBy(xpath = "//input[@id='issuedDate']/following-sibling::div//select[@title='Select a month']")
	public WebElement issuedDateCalenderMonthElement;
	
	@FindBy(xpath = "//input[@id='issuedDate']/following-sibling::div//select[@title='Select a year']")
	public WebElement issuedDateCalenderYearElement;
	
	@FindBy(xpath = "//input[@id='issuedDate']/following-sibling::div//table//tr//td/div[contains(@class, 'picker__day picker__day--infocus')]")
	public List<WebElement> issuedDateCalenderDaysListElement;
	
	//---------------------------expiryDate---------------------------------------
	
	@FindBy(xpath = "//input[@id='expiryDate']/following-sibling::div//i[text()='date_range']")
	public WebElement expiryDateCalenderIconElement;
	
	@FindBy(xpath = "//input[@id='expiryDate']/following-sibling::div//select[@title='Select a month']")
	public WebElement expiryDateCalenderMonthElement;
	
	@FindBy(xpath = "//input[@id='expiryDate']/following-sibling::div//select[@title='Select a year']")
	public WebElement expiryDateCalenderYearElement;
	
	@FindBy(xpath = "//input[@id='expiryDate']/following-sibling::div//table//tr//td/div[contains(@class, 'picker__day picker__day--infocus')]")
	public List<WebElement> expiryDateCalenderDaysListElement;
	
	//------------------------------------reviewDate---------------------------------
	
	@FindBy(xpath = "//input[@id='reviewDate']/following-sibling::div//i[text()='date_range']")
	public WebElement reviewDateCalenderIconElement;
	
	@FindBy(xpath = "//input[@id='reviewDate']/following-sibling::div//select[@title='Select a month']")
	public WebElement reviewDateCalenderMonthElement;
	
	@FindBy(xpath = "//input[@id='reviewDate']/following-sibling::div//select[@title='Select a year']")
	public WebElement reviewDateCalenderYearElement;
	
	@FindBy(xpath = "//input[@id='reviewDate']/following-sibling::div//table//tr//td/div[contains(@class, 'picker__day picker__day--infocus')]")
	public List<WebElement> reviewDateCalenderDaysListElement;
	//----------------------------------------------------------------------------------

	@FindBy(id = "status")
	public WebElement eligibleStatusElement;
	
	@FindBy(id = "notes")
	public WebElement commentsElement;

	
	
	
	
	public AddImmigrationDetailsPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
