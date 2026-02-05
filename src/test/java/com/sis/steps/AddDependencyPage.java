package com.sis.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDependencyPage extends CommonMethods{
	
	@When("Click on DEPENDENS link")
	public void click_on_dependens_link() {
		waitForVisibility(personalDetailsPageElements.dependentsLink).click();
	}
	
	@When("On Dependency Click plus button on right corner")
	public void on_dependency_click_plus_button_on_right_corner() {
		waitForVisibility(addDependencyPageElements.plusButtonElement).click();
	}
	
	@When("Fill Dependency Contact form inputs")
	public void fill_dependency_contact_form_inputs() {
		sendText(addDependencyPageElements.nameElement, "Nurettin");
		waitForVisibility(addDependencyPageElements.dateOfBirthIconElement).click();
		
		List<WebElement> days = addDependencyPageElements.dateOfBirthDaysElementList;
		WebElement month = addDependencyPageElements.dateOfBirthMonthDDElement;
		WebElement year = addDependencyPageElements.dateOfBirthYearDDElement;
		
		setCalendar("20", "February", "1996", days, month, year);
		selectDropdown(addDependencyPageElements.relationshipDropdownElement, "Child");
		
	}
	
	@Then("Click Add Dependency button")
	public void click_add_dependency_button() {
		waitForVisibility(addDependencyPageElements.saveButtoneElement).click();
	}

}
