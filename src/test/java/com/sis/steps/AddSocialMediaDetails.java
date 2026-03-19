package com.sis.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSocialMediaDetails extends CommonMethods{
	@When("Click on SOCIAL MEDIA DETAILS link")
	public void click_on_social_media_details_link() {
	    click(personalDetailsPageElements.socialMediaDetailsElement);
	}
	@When("Admin able to see social media page")
	public void admin_able_to_see_social_media_page() {
	   waitForVisibility(addSocialMediaDetailsPage.socialMediaPagElement);
	}
	@When("Click on PLUS button right corner")
	public void click_on_plus_button_right_corner() {
	    click(addSocialMediaDetailsPage.plusButtonElement);
	}
	@When("Admin able to see Add Social Media Pup up page")
	public void admin_able_to_see_add_social_media_pup_up_page() {
		explicitWaitForElementVisibility(addSocialMediaDetailsPage.titleOfPupUpElement);
		
	}
	@When("Fill out Add Social Media inputs")
	public void fill_out_add_social_media_inputs() {
		sendText(addSocialMediaDetailsPage.handlElement, "Nino");
		sendText(addSocialMediaDetailsPage.linkElement, "https://www.facebook.com");
		
		waitForClickability(addSocialMediaDetailsPage.typeElement).click();
		waitForClickability(waitForVisibility(addSocialMediaDetailsPage.facebookElement)).click();
	
	}
	@When("Click save button Add Social Media")
	public void click_save_button_add_social_media() {
	    waitForClickability(addSocialMediaDetailsPage.saveButtonElement).click();
	}
	@Then("Admin able to see pup up Successfully Saved message")
	public void admin_able_to_see_pup_up_successfully_saved_message() {
		String actualMsg = addSocialMediaDetailsPage.successfullySavedMsgElement.getText().toLowerCase();
		String expectedMsg = "Successfully Saved".toLowerCase();
		
		Assert.assertEquals("Message does NOT match!!!", expectedMsg, actualMsg);
		
	}
	@Then("Entered information should be displayed on the Social Media table")
	public void entered_information_should_be_displayed_on_the_social_media_table() {
		Assert.assertTrue("Table is NOT enabled", addSocialMediaDetailsPage.tableElement.isEnabled());
	}
	
	//-------------------------------------------
	
	@When("Fill out Add Social Media inputs with invalid url link")
	public void fill_out_add_social_media_inputs_with_invalid_url_link() {
		sendText(addSocialMediaDetailsPage.linkElement, "www.facebook.com");
	}
	@Then("It should show Should be a valid url message")
	public void it_should_show_should_be_a_valid_url_message() {
		WebElement urlElement = waitForVisibility(addSocialMediaDetailsPage.invalidUrlElement);
		Assert.assertTrue("Url invalid message does NOT Appear!!", urlElement.isDisplayed());
	}


}
