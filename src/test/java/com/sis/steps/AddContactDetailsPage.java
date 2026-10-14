package com.sis.steps;

import org.junit.Assert;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddContactDetailsPage extends CommonMethods {

	@When("Click on MORE dropdown in Personal Details Page")
	public void click_on_more_dropdown_in_personal_details_page() {
		waitForVisibility(personalDetailsPageElements.firstNamElement);
		click(personalDetailsPageElements.moreLinkElement);
	}

	@When("Click on CONTACT DETAILS option")
	public void click_on_contact_details_option() {
		click(personalDetailsPageElements.contactDetailsLinkElement);
	}

	@When("Admin should be see contact details page")
	public void admin_should_be_see_contact_details_page() {
		waitForVisibility(addContactDetailsPageElements.addressStreat1Element);
	}

	@When("Admin should fill out contact details")
	public void admin_should_fill_out_contact_details() {
		sendText(addContactDetailsPageElements.addressStreat1Element, "5 Cucumber");
		sendText(addContactDetailsPageElements.addressStreat2Element, "5 Selenium");
		sendText(addContactDetailsPageElements.cityElement, "New York City");
		click(addContactDetailsPageElements.countryInputElement);
		click(addContactDetailsPageElements.countryElement);
		click(addContactDetailsPageElements.stateInputElement);
		click(addContactDetailsPageElements.stateElement);
		sendText(addContactDetailsPageElements.zipCodeElement, "11713");
		sendText(addContactDetailsPageElements.mobilePhoneElement, "111 333 66 99");
		sendText(addContactDetailsPageElements.workPhoneElement, "222 333 66 99");
		sendText(addContactDetailsPageElements.homePhoneElement, "333 333 66 99");
		sendText(addContactDetailsPageElements.workEmailElement, "ninoo@gmail.com");
		sendText(addContactDetailsPageElements.otherEmailElement, "nintoooo@gmail.com");

	}

	@When("Admin should click save button in contact details page")
	public void admin_should_click_save_button_in_contact_details_page() {
		jsClick(waitForClickability(waitForVisibility(addContactDetailsPageElements.saveButtonElement)));
	}

	@Then("Admin should able to see Successfully Updated pup up message")
	public void admin_should_able_to_see_successfully_updated_pup_up_message() {
		String actualMsg = addContactDetailsPageElements.pupUpMsgElement.getText();
		String expeMsg = "Successfully Updated";
		Assert.assertEquals("Pup up message does NOT match!!!", expeMsg, actualMsg);
	}

}
