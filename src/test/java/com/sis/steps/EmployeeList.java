package com.sis.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeList extends CommonMethods{
	
	@When("Navigate to PIM and Employee List page")
	public void navigate_to_pim_and_employee_list_page() {
		click(dashbordPageElements.PIMLinkElement);
		click(dashbordPageElements.employeeListElement);
	}
	@Then("User should be see list of employees")
	public void user_should_be_see_list_of_employees() {
	   waitForVisibility(employeeListPageElements.tbodyOfTableElement);
	   Assert.assertNotEquals("List does NOT exist!!!", employeeListPageElements.listOfRowsElements.size(), 0);
	}
	@Then("User should see fifty rows of list by defaults")
	public void user_should_see_fifty_rows_of_list_by_defaults() {
	    Assert.assertEquals("Default list row does NOT match!!!", "50", employeeListPageElements.listTableDefaultRoWebElement.getDomProperty("value"));
	}
	@Then("User should be see that coloumn name")
	public void user_should_be_see_that_coloumn_name(DataTable listOfColoumns) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> listOfColoumn = listOfColoumns.asMaps();
		
		
		
		for(int i=1; i<9; i++) {
			
			String expectedName = listOfColoumn.get(i-1).get("ColoumnName").trim().toUpperCase();
			waitForVisibility(employeeListPageElements.listOfColoumnList.get(i));
			waitMiliSec(2);;
			String actualName = employeeListPageElements.listOfColoumnList.get(i).getText().trim().toUpperCase();
			
			if (actualName.trim().equals("Namearrow_upward".toUpperCase())) {
				actualName = actualName.substring(0,4);
			}
			System.out.println("Actual : " + actualName + " ||  Expected : " + expectedName);
			System.out.println("Actual : " + actualName.length() + " ||  Expected : " + expectedName.length());
			assertEquals("Coloumn name does NOT match!!!", actualName, expectedName);
		}
	   
	}
	
	//-----------------------------------------------------------------------------------------
	
	
	
	//---------------------------------------------------------------------------------
	
	//bu methodta ve bir sonraki methodta should_see_employee_in_filter_list()  ConfigsReader.getProperty("employeeName1") 
	//personalDatails bolumumune gore guncellenmeli hatta yeniden yazilmali
	@Then("Enter Employee Name to input")
	public void enter_employee_name_to_input() {
		waitForVisibility(employeeListPageElements.filteredEmployeeElement);
	    sendText(employeeListPageElements.filterInputElement, ConfigsReader.getProperty("employeeFullName"));
	}
	@Then("Click seach button")
	public void click_seach_button() {
		wait(3);
	   click(employeeListPageElements.searchButtonElement);
	}
	@Then("Should see employee in filter list")
	public void should_see_employee_in_filter_list() {
		wait(3);
	    waitForVisibility(employeeListPageElements.filteredEmployeeElement);
	    String actualName = employeeListPageElements.filteredEmployeeElement.getText();
	    String expectedName = ConfigsReader.getProperty("employeeFullName");
	    Assert.assertEquals("Employee name did NOT filter!!!", expectedName, actualName);
	}
	
	//----------------------------------------------------------------------------------------
	@Then("Click on employee name")
	public void click_on_employee_name() {
	    waitForVisibility(employeeListPageElements.firstEmployeeNameElement);
	    String employeeName = employeeListPageElements.firstEmployeeNameElement.getText();
	    ConfigsReader.setProperty("employeeFullName", employeeName);
 	    click(employeeListPageElements.firstEmployeeNameElement);
	}
	@Then("Navigate to employee details page compare name")
	public void navigate_to_employee_details_page_compare_name() {
	    waitForVisibility(personalDetailsPageElements.firstNamElement);
	    String firstName = personalDetailsPageElements.firstNamElement.getDomProperty("value");
	    String lastName = personalDetailsPageElements.lastNameElement.getDomProperty("value");
	    
	    System.out.println(firstName + " "+ lastName);
	    
	    Assert.assertEquals("Name does NOT match!!!", ConfigsReader.getProperty("employeeFullName"), firstName + " "+ lastName);
	}

}
