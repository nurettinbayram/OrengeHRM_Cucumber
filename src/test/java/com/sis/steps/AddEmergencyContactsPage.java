package com.sis.steps;

import org.junit.Assert;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmergencyContactsPage extends CommonMethods{
	
	@When("Click on EMERGRCY CONTACTS link")
	public void click_on_emergrcy_contacts_link() {
		waitForClickability(personalDetailsPageElements.emergencyContactsElement).click();
	}
	
	@When("Click plus button on right corner")
	public void click_plus_button_on_right_corner() {
		waitForVisibility(addEmergencyContactsPageElements.plusButtonElement).click();
	}
	
	@When("Fill Add Emergency Contact form inputs")
	public void fill_add_emergency_contact_form_inputs() {
		sendText(addEmergencyContactsPageElements.nameElement, "Nurettin Bayram");
		sendText(addEmergencyContactsPageElements.relationshipElement, "Parent");
		sendText(addEmergencyContactsPageElements.mobilePhoneElement, "555 666 22 11");
	}
	
	@Then("Click Add Emergency Contact button")
	public void click_add_emergency_contact_button() {
		waitForVisibility(addEmergencyContactsPageElements.saveButtoneElement).click();
	}
	
	@Then("User should be able to see success message")
	public void user_should_be_able_to_see_success_message() {
		String actualMsg = addEmergencyContactsPageElements.successfullySavedMsgElement.getText();
		String expectedMsg = "Successfully Saved";
		Assert.assertEquals("Message does NOT match !!!", expectedMsg, actualMsg);
	}


}
