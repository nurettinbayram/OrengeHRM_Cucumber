package com.sis.steps;

import org.junit.Assert;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFunctionality extends CommonMethods{

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
		wait(3);
	}
	
}
