package com.sis.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPersonalDetailsPage extends CommonMethods{
	
	@When("Fill out personal page inputs and click save button")
	public void fill_out_personal_page_inputs_and_click_save_button() {
	    waitForVisibility(personalDetailsPageElements.firstNamElement);
	    sendText(personalDetailsPageElements.otherIdElement, "123");
	    click(personalDetailsPageElements.iconDateOfBirthElement);

	    WebElement bm = personalDetailsPageElements.dateOfBirthMonthElement;
	    WebElement by = personalDetailsPageElements.dateOfBirthYearElement;
	    List<WebElement> bd = personalDetailsPageElements.listOfDaysDateOfBirthElements;
	    
	    setCalendar("20", "May", "1996", bd, bm, by);
	    
	    selectUnVisibleDropdown(personalDetailsPageElements.maritalStatusDropdownElement, "Single");
	    selectUnVisibleDropdown(personalDetailsPageElements.genderDropdownElement, "Male");
	    selectUnVisibleDropdown(personalDetailsPageElements.nationalityDropdownElement, "German");
	    sendText(personalDetailsPageElements.licenceNoElement, "111 222 333");
	    
	    click(personalDetailsPageElements.iconLicenseExpiryDateElement);
	    WebElement lm = personalDetailsPageElements.licenseExpiryMonthElement;
	    WebElement ly = personalDetailsPageElements.licenseExpiryYearElement;
	    List<WebElement> ld = personalDetailsPageElements.listOfDaysLicenseExpiryElements;
	    
	    setCalendar("10", "May", "2030", ld, lm, ly);
	    
	    sendText(personalDetailsPageElements.nickNameElement, "Nino");
	    sendText(personalDetailsPageElements.militaryServiceElement, "AA");
	    click(personalDetailsPageElements.smokerCheckboxElement);
	    selectUnVisibleDropdown(personalDetailsPageElements.raceOrEthnicityElement, "White");
	    
	    click(personalDetailsPageElements.saveButtonElement);
	    
	    
	}
	@Then("shown pup up with Successfully Saved message")
	public void shown_pup_up_with_successfully_saved_message() {
		String actualMsg = personalDetailsPageElements.successPopUpElement.getText();
		String expectedMsg = "Successfully Updated";
		System.out.println(actualMsg +" " + expectedMsg);
	    Assert.assertEquals("Pup Up Message does NOT match!!!", expectedMsg, actualMsg);
	}

}
