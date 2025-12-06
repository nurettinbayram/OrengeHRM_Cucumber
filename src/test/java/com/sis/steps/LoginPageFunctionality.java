package com.sis.steps;

import org.junit.Assert;

import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFunctionality extends CommonMethods{

	//-------------Positive Test-------------------
	
	@When("I should able to navigate {string}")
	public void i_should_able_to_navigate(String link) {
		System.out.println("Link" + link);
	}
	
	@When("Enter Admin Credential {string} {string}")
	public void enter_admin_credential(String username, String password) {
		sendText(loginPageElements.usernamElement, username);
		sendText(loginPageElements.passwordElement, password);
	}
	
	@When("Click Login button")
	public void click_login_button() {
		click(loginPageElements.loginButtonElement);
	}
	
	@Then("User should be able to see Dashbord page")
	public void user_should_be_able_to_see_dashbord_page() {
		waitForVisibility(loginPageElements.accountNamElement);
		String accountName = loginPageElements.accountNamElement.getText();
		Assert.assertEquals("Account name does NOT natch", "Jacqueline White", accountName);
	}
	
	// ---------------Nagative Test Empty Password----------
	
	@Then("User should be able to see {string} message for password")
	public void user_should_be_able_to_see_message_for_password(String msg) {
		String actualTxtMsg = loginPageElements.txtPasswordErrorElement.getText();
		Assert.assertEquals("Password error massage does NOT match!!!", msg, actualTxtMsg);
	}
	
	
	@Then("User should be able to see {string} message for username")
	public void user_should_be_able_to_see_message_for_username(String msg) {
		String actualTxtMsg = loginPageElements.txtUsernameErrorElement.getText();
		Assert.assertEquals("Password error massage does NOT match!!!", msg, actualTxtMsg);
	}
	
	
	// -------------------LOGIN--------------------------

	public static void loginFunction() {
		sendText(loginPageElements.usernamElement, ConfigsReader.getProperty("username"));
		sendText(loginPageElements.passwordElement, ConfigsReader.getProperty("password"));
		click(loginPageElements.loginButtonElement);
	}

	
}
