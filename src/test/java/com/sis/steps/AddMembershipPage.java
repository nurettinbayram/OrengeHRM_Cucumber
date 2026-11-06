package com.sis.steps;

import com.sis.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddMembershipPage extends CommonMethods{

	@When("Click on Membership  link")
	public void click_on_membership_link() {
	    click(personalDetailsPageElements.membershipsLinkElement);
	}
	@When("Upon clicking on plus sign modal {string} should be displayed")
	public void upon_clicking_on_plus_sign_modal_should_be_displayed(String title) {
		waitForVisibility(addMembershipPageElements.addMembershipTitle);
		Assert.assertEquals("Title does NOT match!!!", title, addMembershipPageElements.addMembershipTitle.getText());
	}
	@When("The modal should have the following fields")
	public void the_modal_should_have_the_following_fields(DataTable dataTable) {
		List<String> expectedLabelList = dataTable.asList();
		List<String> actualLabelList = new ArrayList<>();
		for (WebElement label : addMembershipPageElements.listOfLabels){
			actualLabelList.add(label.getText());
		}


		Assert.assertEquals("List of Label does NOT match!!!",expectedLabelList , actualLabelList);

	    
	}
	@When("Enter Membership {string}")
	public void enter_membership(String membership) {
		selectDropdown(addMembershipPageElements.membershipDropdown, membership);
	}
	@When("Enter Subscription Paid By {string}")
	public void enter_subscription_paid_by(String subscriptionPaidBy) {
	    selectDropdown(addMembershipPageElements.subscriptionPaidByDropdown, subscriptionPaidBy);
	}
	@When("Enter Subscription Amount {string}")
	public void enter_subscription_amount(String subscriptionFee) {
	    sendText(addMembershipPageElements.subscriptionFee, subscriptionFee);
	}
	@When("Enter Currency {string}")
	public void enter_currency(String currency) {
	    selectDropdown(addMembershipPageElements.subscriptionCurrencyDropdown, currency);
	}
	@When("Enter Subscription Commence Date {string}")
	public void enter_subscription_commence_date(String commenceDate) {
	    sendText(addMembershipPageElements.subscriptionCommenceDate, commenceDate);
	}
	@When("Enter Subscription Renewal Date {string}")
	public void enter_subscription_renewal_date(String renewalDate) {
	   sendText(addMembershipPageElements.subscriptionRenewalDate, renewalDate);

	}
	@Then("Entered information should be displayed on the Assigned Memberships table {string}")
	public void entered_information_should_be_displayed_on_the_assigned_memberships_table(String membership) {
		//We need to refresh the page and then get elements.
		driver.navigate().refresh();
		waitForVisibility(addMembershipPageElements.tableElement);

		List<String > listOfMembership = new ArrayList<>();
		for (WebElement member : addMembershipPageElements.listOfMemberships){
			listOfMembership.add(member.getText());
			System.out.println(member.getText());
		}
		System.out.println(listOfMembership);
		Assert.assertTrue("The "+membership+ " was NOT entered in the List", listOfMembership.contains(membership));
	}



}
