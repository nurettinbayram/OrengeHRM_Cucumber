package com.sis.testbase;

import com.sis.pages.AddContactDetailsPageElements;
import com.sis.pages.AddEmployeePageElements;
import com.sis.pages.DashbordPageElements;
import com.sis.pages.EmployeeListPageElements;
import com.sis.pages.LoginPageElements;
import com.sis.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements loginPageElements;
	public static AddEmployeePageElements addEmployeePageElements;
	public static DashbordPageElements dashbordPageElements;
	public static PersonalDetailsPageElements personalDetailsPageElements;
	public static EmployeeListPageElements employeeListPageElements;
	public static AddContactDetailsPageElements addContactDetailsPageElements;
	
	
	
	public static void initialize()
	{
		loginPageElements = new LoginPageElements();
		addEmployeePageElements = new AddEmployeePageElements();
		dashbordPageElements = new DashbordPageElements();
		personalDetailsPageElements = new PersonalDetailsPageElements();
		employeeListPageElements = new EmployeeListPageElements();
		addContactDetailsPageElements = new AddContactDetailsPageElements();
		
	}

}
