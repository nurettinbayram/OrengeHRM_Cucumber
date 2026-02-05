package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddSocialMediaDetailsPage {
	
	@FindBy(xpath = "//div[@id='socialMediaDiv']//span[text()='Social Media']")
	public WebElement socialMediaPagElement;
	
	@FindBy(xpath = "//div[@data-tooltip='Add Social Media']")
	public WebElement plusButtonElement;
	
	@FindBy(xpath = "//button[@data-id='typeId']")
	public WebElement typeElement;
	
	@FindBy(id = "profileName")
	public WebElement handlElement;
	
	@FindBy(id = "profileLink")
	public WebElement linkElement;
	
	@FindBy(xpath = "//span[text()='Allow share in public']")
	public WebElement checkboxElement;
	
	@FindBy(xpath = "//h5[text()='Add Social Media']")
	public WebElement titleOfPupUpElement;
	
	@FindBy(xpath = "//select[@id='typeId']/following-sibling::div//span[text()='Facebook']")
	public WebElement facebookElement;
	
	@FindBy(xpath = "//select[@id='typeId']/following-sibling::div//span[text()='LinkedIn']")
	public WebElement linkedinElement;
	
	@FindBy(xpath = "//select[@id='typeId']/following-sibling::div//span[text()='Twitter']")
	public WebElement twitterElement;
	
	@FindBy(xpath = "//list/table/tbody/tr")
	public WebElement tableElement;
	
	@FindBy(xpath = "//div[text()='Successfully Saved']")
	public WebElement successfullySavedMsgElement;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButtonElement;
	
	@FindBy(xpath = "//span[text()='Should be a valid url']")
	public WebElement invalidUrlElement;
	
	
	
	
	
	
	
	
	
	public AddSocialMediaDetailsPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
