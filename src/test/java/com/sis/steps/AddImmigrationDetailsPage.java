package com.sis.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.When;

public class AddImmigrationDetailsPage extends CommonMethods{
	@When("Click on Immigration link")
	public void click_on_immigration_link() {
		click(personalDetailsPageElements.immigrationLink);
	}
	
	@When("Click on PLUS Immigration button right corner")
	public void click_on_plus_immigration_button_right_corner() {
		addImmigrationDetailsPageElement.plusButtonElement.click();
	}
	
	
	@When("Fill out Immigration inputs")
	public void fill_out_immigration_inputs() {
		click(addImmigrationDetailsPageElement.documentVisaElement);
		sendText(addImmigrationDetailsPageElement.numberElement, "221122");
		selectDropdown(addImmigrationDetailsPageElement.issuedByDropdownIconElement, "Germany");
		
		click(addImmigrationDetailsPageElement.issuedDateCalenderIconElement);
		WebElement idY = addImmigrationDetailsPageElement.issuedDateCalenderYearElement;
		WebElement idM = addImmigrationDetailsPageElement.issuedDateCalenderMonthElement;
		List<WebElement> idDL = addImmigrationDetailsPageElement.issuedDateCalenderDaysListElement;
		
		setCalendar("20", "May", "2020", idDL, idM, idY);
		
		click(addImmigrationDetailsPageElement.expiryDateCalenderIconElement);
		WebElement eY = addImmigrationDetailsPageElement.expiryDateCalenderYearElement;
		WebElement eM = addImmigrationDetailsPageElement.expiryDateCalenderMonthElement;
		List<WebElement> eDL = addImmigrationDetailsPageElement.expiryDateCalenderDaysListElement;
		
		setCalendar("25", "June", "2027", eDL, eM, eY);
		
		click(addImmigrationDetailsPageElement.reviewDateCalenderIconElement);
		WebElement elY = addImmigrationDetailsPageElement.reviewDateCalenderYearElement;
		WebElement elM = addImmigrationDetailsPageElement.reviewDateCalenderMonthElement;
		List<WebElement> elDL = addImmigrationDetailsPageElement.reviewDateCalenderDaysListElement;
		
		setCalendar("10", "April", "2027", elDL, elM, elY);
		
		sendText(addImmigrationDetailsPageElement.eligibleStatusElement, "Eligible ");
		sendText(addImmigrationDetailsPageElement.commentsElement, "sas");
		
	}

}
