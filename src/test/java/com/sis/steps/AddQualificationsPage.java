package com.sis.steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddQualificationsPage extends CommonMethods {

	// ----------------------WORK EXPERIENCE------------------------------------
	@When("Click on QUALIFICATION link")
	public void click_on_qualification_link() {
		click(personalDetailsPageElements.qualificationLinkElement);
	}

	@When("Hover over plus button")
	public void hover_over_plus_button() {
		waitForVisibility(addQualificationsPageElements.plusButtonElement);

		// Here mouse is moved on button by using actions class.
		Actions action = new Actions(driver);
		action.moveToElement(addQualificationsPageElements.plusButtonElement).perform();

	}

	@When("Click WORK EXPERIENCE link")
	public void click_work_experience_link() {
		click(addQualificationsPageElements.workExperiencElement);
	}

	@When("Fill Work experience field")
	public void fill_work_experience_field() {
		sendText(addQualificationsPageElements.companyElement, "Epic System");
		sendText(addQualificationsPageElements.jobtitleElement, "MyChar");
//		sendText(addQualificationsPageElements.commentsElement, "");
//		click(addQualificationsPageElements.creditableElement);

		/*----------------NORMAL CODES-------------------
		 * //Here we use select class to get drop down element. Select fromMonthSelect =
		 * new Select(addQualificationsPageElements.fromCalenderMonthElement);
		 * fromMonthSelect.selectByVisibleText("July");
		 * 
		 * Select fromYearSelect = new
		 * Select(addQualificationsPageElements.fromCalenderYearElement);
		 * fromYearSelect.selectByVisibleText("2020");
		 * 
		 * List<WebElement> fromElememt =
		 * addQualificationsPageElements.fromCalenderElements; for (int i = 0; i <
		 * fromElememt.size(); i++) { if (fromElememt.get(i).getText().equals("20")) {
		 * click(fromElememt.get(i)); break; } System.out.println(fromElememt.get(i) +
		 * "\n");
		 * 
		 * }
		 */
		click(addQualificationsPageElements.fromCalanderIconElement);
		selectDropdown(addQualificationsPageElements.fromCalenderMonthElement, "May");
		selectDropdown(addQualificationsPageElements.fromCalenderYearElement, "2022");
		selectCalendarDate(addQualificationsPageElements.fromCalenderElements, "5");

		click(addQualificationsPageElements.toCalanderIconElement);
		selectDropdown(addQualificationsPageElements.toCalenderMonthElement, "June");
		selectDropdown(addQualificationsPageElements.toCalenderYearElement, "2025");
		selectCalendarDate(addQualificationsPageElements.toCalenderElements, "25");

		click(addQualificationsPageElements.creditableElement);
		sendText(addQualificationsPageElements.commentsElement, "Engineer");

	}

	@When("Click Work experience save button")
	public void click_work_experience_save_button() {
		jsClick(addQualificationsPageElements.saveButtonElement);
		// HERE WE REFRESH THE PAGE AND GET TABLE
		driver.navigate().refresh();

	}

	@Then("User should be able to see the Record on the work experiance table")
	public void user_should_be_able_to_see_record_on_the_work_experience_table() {
		assertEquals("The message does NOT match!!!", "Epic System",
				addQualificationsPageElements.workTableCompanyElement.getText());

	}

	// -----------------------------------EDUCATION-----------------------------------

	@When("Click EDUCATION link")
	public void click_education_link() {
		jsClick(addQualificationsPageElements.educationLinkElement);
	}

	@When("Fill Edications inputs")
	public void fill_edications_inputs() {
		click(addQualificationsPageElements.fromEducationCalanderIconElement);
		selectDropdown(addQualificationsPageElements.fromEducationCalenderMonthElement, "May");
		selectDropdown(addQualificationsPageElements.fromEducationCalenderYearElement, "2022");
		selectCalendarDate(addQualificationsPageElements.fromEducationCalenderElements, "5");

		click(addQualificationsPageElements.toEducationCalanderIconElement);
		selectDropdown(addQualificationsPageElements.toEducationCalenderMonthElement, "June");
		selectDropdown(addQualificationsPageElements.toEducationCalenderYearElement, "2025");
		selectCalendarDate(addQualificationsPageElements.toEducationCalenderElements, "25");

		selectDropdown(addQualificationsPageElements.lavelDropdownElement, "Bachelor's Degree");
		sendText(addQualificationsPageElements.instituteElement, "DDD");
		sendText(addQualificationsPageElements.majorElement, "Major");
		sendText(addQualificationsPageElements.yearElement, "4");
		sendText(addQualificationsPageElements.scoreElement, "85");
	}

	@Then("User should be able to see the Record on the educarion table")
	public void user_should_be_able_to_see_the_record_on_the_educarion_table() {
		assertEquals("Content does NOT match!!!", "Bachelor's Degree",
				addQualificationsPageElements.educationTableElement.getText());
	}

	// ----------------------------------------Skill------------------------------------------

	@When("Click SKILL link")
	public void click_skill_link() {
		click(addQualificationsPageElements.skillLinkElement);
	}

	@When("Fill Skill link inputs")
	public void fill_skill_link_inputs() {
		selectDropdown(addQualificationsPageElements.skillDropdownElement, "Programming");
		sendText(addQualificationsPageElements.yearsOfExpElement, "4");
		sendText(addQualificationsPageElements.commentsSkillElement, "EXP");
	}

	@Then("User should be able to see the Record on the skill table")
	public void user_should_be_able_to_see_the_record_on_the_skill_table() {
		Assert.assertEquals("Does Not match!!!", "Programming",
				addQualificationsPageElements.skillTableElement.getText());
	}

	// -------------------------------------Language-----------------------------------

	@When("Click LANGUAGE link")
	public void click_language_link() {
		click(addQualificationsPageElements.languageLinkElement);
	}

	@When("Fill Language link inputs")
	public void fill_language_link_inputs() {
		String langString = "English";
		String skillString = "Speaking";
		String fluencyString = "Mother Tongue";

		selectDropdown(addQualificationsPageElements.languageDropdownElement, langString);
		selectDropdown(addQualificationsPageElements.fluencyLavelDropdownElement, fluencyString);
		selectDropdown(addQualificationsPageElements.skillLanguageDropdownElement, skillString);

	}

	@Then("User should be able to see the Record on the Language table")
	public void user_should_be_able_to_see_the_record_on_the_language_table() {
		Assert.assertEquals("does NOT match!!!", "English",
				addQualificationsPageElements.languageTableElement.getText());
	}
	
	//---------------------------Licence---------------------------------
	@When("Click LICENCE link")
	public void click_licence_link() {
	    click(addQualificationsPageElements.licenseLinkElement);
	}
	@When("Fill LICENCE link inputs")
	public void fill_licence_link_inputs() {
	    String licenseTypString = "Professional License";
	    
	    selectDropdown(addQualificationsPageElements.licenseTypElement, licenseTypString);
	    sendText(addQualificationsPageElements.licenseNoElement, "2525");
	    
	    click(addQualificationsPageElements.issuedDataCalanderIconElement);
	    selectDropdown(addQualificationsPageElements.issuedDataCalenderMonthElement, "May");
	    selectDropdown(addQualificationsPageElements.issuedDataCalenderYearElement, "2015");
	    selectCalendarDate(addQualificationsPageElements.issuedDataCalenderDaysElements, "10");
	    
	    click(addQualificationsPageElements.expiryDayCalanderIconElement);
	    selectDropdown(addQualificationsPageElements.expiryDayCalenderMonthElement, "May");
	    selectDropdown(addQualificationsPageElements.expiryDayCalenderYearElement, "2027");
	    selectCalendarDate(addQualificationsPageElements.expiryDayCalenderDaysElements, "10");
	}
	@Then("User should be able to see the Record on the LICENCE table")
	public void user_should_be_able_to_see_the_record_on_the_licence_table() {
	    
	}

}
