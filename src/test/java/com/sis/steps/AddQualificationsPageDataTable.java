package com.sis.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.sis.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class AddQualificationsPageDataTable extends CommonMethods {

	// ----------------------WORK EXPERIENCE------------------------------------
	
	@When("Fill Work Experience Input with Data Table")
	public void fill_work_experience_input_with_data_table(DataTable dataTable) {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String, String>> jopExp = dataTable.asMaps();
	    for(Map<String, String> jopMap : jopExp) {
	    	waitForVisibility(addQualificationsPageElements.plusButtonElement);
	    	

			// Here mouse is moved on button by using actions class.
			Actions action = new Actions(driver);
			action.moveToElement(addQualificationsPageElements.plusButtonElement).perform();
			
	    	click(addQualificationsPageElements.workExperiencElement);
	    	sendText(addQualificationsPageElements.companyElement, jopMap.get("Company"));
			sendText(addQualificationsPageElements.jobtitleElement, jopMap.get("JobTitle"));
			sendText(addQualificationsPageElements.fromDateInputElement, jopMap.get("From"));
			sendText(addQualificationsPageElements.toDateInputElement, jopMap.get("To"));
			
			jsClick(addQualificationsPageElements.saveButtonElement);
			// HERE WE REFRESH THE PAGE AND GET TABLE
			driver.navigate().refresh();
	    	System.out.println(jopMap.get("Company") +" " + jopMap.get("JobTitle") +" "+ jopMap.get("From") + "\n" );
  	
	    	boolean result = addQualificationsPageElements.workExpListElement.getText().contains(jopMap.get("Company"));
	    	Assert.assertTrue("There is NOT a record with" + jopMap.get("Company"), result);
	    	
	    	
	    }
	}
	
	//---------------------EDUCATION----------------------
	@When("Fill Edications inputs with Data Table")
	public void fill_edications_inputs_with_data_table(DataTable dataTable) {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> educationList = dataTable.asMaps();
		for(Map<String, String> infoMap : educationList) {
			waitForVisibility(addQualificationsPageElements.plusButtonElement);
			// Here mouse is moved on button by using actions class.
			Actions action = new Actions(driver);
			action.moveToElement(addQualificationsPageElements.plusButtonElement).perform();
			
			jsClick(addQualificationsPageElements.educationLinkElement);
			
			sendText(addQualificationsPageElements.eduStartDatElement, infoMap.get("StartDate"));
			sendText(addQualificationsPageElements.eduEndDatElement, infoMap.get("EndDate"));


			selectDropdown(addQualificationsPageElements.lavelDropdownElement, infoMap.get("Lavel"));
			sendText(addQualificationsPageElements.instituteElement, infoMap.get("Institute"));
			sendText(addQualificationsPageElements.majorElement, infoMap.get("Major"));
			sendText(addQualificationsPageElements.yearElement, infoMap.get("Year"));
			sendText(addQualificationsPageElements.scoreElement, infoMap.get("Score"));
			
			jsClick(addQualificationsPageElements.saveButtonElement);
			// HERE WE REFRESH THE PAGE AND GET TABLE
			driver.navigate().refresh();
			
			boolean result = addQualificationsPageElements.educationListElement.getText().contains(infoMap.get("Lavel"));
	    	Assert.assertTrue("There is NOT a record with" + infoMap.get("Lavel"), result);
		}
	   
	}
	
	//---------------------SKILLS----------------------
	
	@When("Fill Skill link inputs with Data Table")
	public void fill_skill_link_inputs_with_data_table(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> skillsList = dataTable.asMaps();
	    for(Map<String, String> skillMap : skillsList) {
	    	waitForVisibility(addQualificationsPageElements.plusButtonElement);

			// Here mouse is moved on button by using actions class.
			Actions action = new Actions(driver);
			action.moveToElement(addQualificationsPageElements.plusButtonElement).perform();
			click(addQualificationsPageElements.skillLinkElement);
			
			selectDropdown(addQualificationsPageElements.skillDropdownElement, skillMap.get("Skill"));
			sendText(addQualificationsPageElements.yearsOfExpElement, skillMap.get("YearsOfExperience"));
			sendText(addQualificationsPageElements.commentsSkillElement, "EXP");
			
			jsClick(addQualificationsPageElements.saveButtonElement);
			// HERE WE REFRESH THE PAGE AND GET TABLE
			driver.navigate().refresh();
			
			boolean isSkillAdded = addQualificationsPageElements.skillsListElement.getText().contains(skillMap.get("Skill"));
			Assert.assertTrue("There is no expected record!!!", isSkillAdded);
	    }
	}
	
	//------------------LANGUAGE-------------------------
	@When("Enter language input {string}")
	public void enter_language_input(String language) {
		selectDropdown(addQualificationsPageElements.languageDropdownElement, language);
		
	}
	@When("Enter skill input {string}")
	public void enter_skill_input(String skill) {
		
		selectDropdown(addQualificationsPageElements.skillLanguageDropdownElement, skill);
	}
	@When("Enter fluency level input {string}")
	public void enter_fluency_level_input(String lavel) {
		selectDropdown(addQualificationsPageElements.fluencyLavelDropdownElement, lavel);
	}

}
