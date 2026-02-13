package com.sis.testbase;

import com.sis.pages.AddContactDetailsPageElements;
import com.sis.pages.AddDependencyPageElements;
import com.sis.pages.AddEmergencyContactsPageElements;
import com.sis.pages.AddEmployeePageElements;
import com.sis.pages.AddImmigrationDetailsPageElement;
import com.sis.pages.AddSocialMediaDetailsPage;
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
	public static AddSocialMediaDetailsPage addSocialMediaDetailsPage;
	public static AddEmergencyContactsPageElements addEmergencyContactsPageElements;
	public static AddDependencyPageElements addDependencyPageElements;
	public static AddImmigrationDetailsPageElement addImmigrationDetailsPageElement;
	
	
	
	public static void initialize()
	{
		loginPageElements = new LoginPageElements();
		addEmployeePageElements = new AddEmployeePageElements();
		dashbordPageElements = new DashbordPageElements();
		personalDetailsPageElements = new PersonalDetailsPageElements();
		employeeListPageElements = new EmployeeListPageElements();
		addContactDetailsPageElements = new AddContactDetailsPageElements();
		addSocialMediaDetailsPage = new AddSocialMediaDetailsPage();
		addEmergencyContactsPageElements = new AddEmergencyContactsPageElements();
		addDependencyPageElements = new AddDependencyPageElements();
		addImmigrationDetailsPageElement = new AddImmigrationDetailsPageElement();
		
	}

}
