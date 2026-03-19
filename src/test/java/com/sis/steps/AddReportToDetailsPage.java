package com.sis.steps;

import org.openqa.selenium.interactions.Actions;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.When;

public class AddReportToDetailsPage extends CommonMethods{

	@When("Click on Report-to link")
	public void click_on_report_to_link() {
		click(personalDetailsPageElements.reportTo);
	}
	@When("Mause hover over plus icon")
	public void mause_hover_over_plus_icon() {
		Actions actions = new Actions(driver);
		actions.moveToElement(addReportToDetailsPageElements.plusBtnElement).perform();
		
	}
	@When("Click Supervisor Icon")
	public void click_supervisor_icon() {
		click(addReportToDetailsPageElements.supervisorIconElement);
	}
	@When("Fill inputs on Supervisur")
	public void fill_inputs_on_supervisur() {
		sendText(addReportToDetailsPageElements.nameInputElement, "0032");
		
		while(!addReportToDetailsPageElements.nameInputElement.getDomProperty("value").equals("Brody Alan")) {
			waitMiliSec(5);
		}
		
		click(addReportToDetailsPageElements.dropdownIconElement);
		click(addReportToDetailsPageElements.selectDirectorElement);
	}
	@When("Click save button on Supervisor pop up")
	public void click_save_button_on_supervisor_pop_up() {
		click(addReportToDetailsPageElements.saveBtnElement);
	}
	
	//-----------------Subordinate-----------------------
	@When("Click Subordinate Icon")
	public void click_subordinate_icon() {
		click(addReportToDetailsPageElements.subordinateIconElement);
	}
	@When("Fill inputs on Subordinate")
	public void fill_inputs_on_subordinate() {
		sendText(addReportToDetailsPageElements.nameInputElement, "0029");
		while(!addReportToDetailsPageElements.nameInputElement.getDomProperty("value").equals("Aaliyah Haq")) {
			waitMiliSec(5);
		}
		click(addReportToDetailsPageElements.dropdownIconElement);
		click(addReportToDetailsPageElements.selectDirectorElement);
	}

}
