package com.sis.steps;

import java.util.Random;

import org.junit.Assert;

import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee extends CommonMethods{
	
	@Given("Login with Admin credential")
	public void login_with_admin_credential() {
	    LoginPageFunctionality.loginFunction();
	}
	@When("Navigate to PIM and Add Employee page")
	public void navigate_to_pim_and_add_employee_page() {
	    waitForVisibility(dashbordPageElements.accountNamElement);
	    click(dashbordPageElements.PIMLinkElement);
	    click(dashbordPageElements.addEmployeeElement);
	}
	@When("Fill inputs")
	public void fill_inputs() {
		
		Random random = new Random();
		Integer id = random.nextInt(1000, 9999);
		System.out.println("Employee ID : " + id);
		ConfigsReader.setProperty("id", id.toString());
		
	    waitForVisibility(addEmployeePageElements.firstNameElement);
	    sendText(addEmployeePageElements.firstNameElement, ConfigsReader.getProperty("fistname"));
	    sendText(addEmployeePageElements.lastNameElement, ConfigsReader.getProperty("lastname"));
	    sendText(addEmployeePageElements.idElement, id.toString());
	    selectDropdown(addEmployeePageElements.locationDropdownElement, ConfigsReader.getProperty("location"));
	    wait(1);
	}
	@When("Click Save button")
	public void click_save_button() {
		click(addEmployeePageElements.saveButtonElement);
	}
	
	@Then("Validate employee")
	public void validate_employee() {
		waitForVisibility(addEmployeePageElements.successfullySavedMsgElement);
		Assert.assertEquals("Message does NOT match!!!", addEmployeePageElements.successfullySavedMsgElement.getText(), "Successfully Saved");
		
		String expactedEmployeeId = personalDetailsPageElements.employeeIdElement.getDomProperty("value");
		String actualEmployeeId = ConfigsReader.getProperty("id");
		
		Assert.assertEquals("The ID does NOT match!!!", expactedEmployeeId, actualEmployeeId);
	}
	
	
	//------------------------------------------------------------
	@Then("Click Cancel button should close the pop up")
	public void click_cancel_button_should_close_the_pop_up() {
	    waitForVisibility(employeeListPageElements.titleOfEmployeeListElement);
	    Assert.assertEquals("The title of employee list does NOT match!!", employeeListPageElements.titleOfEmployeeListElement.getText(), "Employee List");
	}

	
	//-------------------------------------------
	@When("Leave empty fistname")
	public void leave_empty_fistname() {
		sendText(addEmployeePageElements.lastNameElement, ConfigsReader.getProperty("lastname"));
	    sendText(addEmployeePageElements.idElement, "1234");
	    selectDropdown(addEmployeePageElements.locationDropdownElement, ConfigsReader.getProperty("location"));
	    click(addEmployeePageElements.saveButtonElement);
	}
	
	@Then("check error message")
	public void check_error_message() {
	    Assert.assertEquals("Empty Error message does NOT match!!!", addEmployeePageElements.emptyErrorMsgElement.getText(), "Required");
	}


}
