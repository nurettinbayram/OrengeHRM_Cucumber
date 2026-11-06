package com.sis.steps;

import com.sis.pages.CreateDisciplinaryCasePageElements;
import com.sis.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CreateDisciplinaryCase extends CommonMethods {
    @When("Navigate to Disiplinary Case page")
    public void navigate_to_disiplinary_case_page() {
        waitForVisibility(dashbordPageElements.accountNamElement);
        click(dashbordPageElements.disciplineLinkElement);
        click(dashbordPageElements.disciplinaryLinkElement);
    }

    @When("Click plus button on right corner for disciplinary modal")
    public void click_plus_button_on_right_corner_for_disciplinary_modal() {
        //Switch To Frame
        switchToFrame(createDisciplinaryCasePageElements.frameElement);
        click(createDisciplinaryCasePageElements.plusButton);
    }

    @When("The Disciplinary Case modal should have the following fields")
    public void the_disciplinary_case_modal_should_have_the_following_fields(DataTable labelsDataTable) {
        List<String> labelListText = new ArrayList<>();
        List<String> labelsString = labelsDataTable.asList();

        for (WebElement label : createDisciplinaryCasePageElements.labelsList) {
            labelListText.add(label.getText());
        }
        Assert.assertEquals("Labels List does NOT match!!!", labelsString, labelListText);

    }

    @When("Enter employee name {string}")
    public void enter_employee_name(String name) {
        sendText(createDisciplinaryCasePageElements.employeeName, name);
        createDisciplinaryCasePageElements.employeeName.sendKeys(Keys.ENTER);
    }

    @When("Enter case name {string}")
    public void enter_case_name(String caseName) {
        sendText(createDisciplinaryCasePageElements.caseName, caseName);
    }

    @When("Enter description {string}")
    public void enter_description(String desc) {
        sendText(createDisciplinaryCasePageElements.caseDescription, desc);
    }

    @Then("Upon Clicking Save additional fields should display This is out of scope for this development cycle")
    public void upon_clicking_save_additional_fields_should_display_this_is_out_of_scope_for_this_development_cycle() {
        click(createDisciplinaryCasePageElements.saveButton);
    }

    @Then("Upon Clicking Save and clicking Cancel")
    public void upon_clicking_save_and_clicking_cancel() {
        //Switch To Frame
        jsClick(createDisciplinaryCasePageElements.cancelButton);
        
    }

    @Then("User should see entered information in the Disciplinary Cases table")
    public void user_should_see_entered_information_in_the_disciplinary_cases_table() {
        //Complete this step later
    }
}
