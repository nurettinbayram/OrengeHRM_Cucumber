package com.sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class EmployeeListPageElements {

	@FindBy(xpath = "//li[text()='Employee List']")
	public WebElement titleOfEmployeeListElement;
	
	@FindBy(xpath = "//table[@id='employeeListTable']/tbody")
	public WebElement tbodyOfTableElement;
	
	@FindBy(xpath = "//table[@id='employeeListTable']/tbody/tr")
	public List<WebElement> listOfRowsElements;
	
	@FindBy(xpath = "//li[text()='Rows per page']/following-sibling::li/div/input")
	public WebElement listTableDefaultRoWebElement;
	
	@FindBy(xpath = "//table[@id='employeeListTable']/thead/tr/th")
	public List<WebElement> listOfColoumnList;
	
	@FindBy(css = "#employeeListTable tbody tr td:nth-child(3)")
	public WebElement firstEmployeeNameElement;
	
	@FindBy(id = "employee_name_quick_filter_employee_list_value")
	public WebElement filterInputElement;
	
	@FindBy(id = "quick_search_icon")
	public WebElement searchButtonElement;
	
	@FindBy(css = "#employeeListTable tbody tr td:nth-of-type(3)")
	public WebElement filteredEmployeeElement; 
	

	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
