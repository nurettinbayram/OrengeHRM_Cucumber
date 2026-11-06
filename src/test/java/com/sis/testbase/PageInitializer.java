package com.sis.testbase;

import com.sis.pages.*;

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
	public static AddWorkWeekDetailsPageElements addWorkWeekDetailsPageElements;
	public static AddReportToDetailsPageElements addReportToDetailsPageElements;
	public static AddQualificationsPageElements addQualificationsPageElements;
	public static AddMembershipPageElements addMembershipPageElements;
	public static CreateDisciplinaryCasePageElements createDisciplinaryCasePageElements;
	
	
	
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
		addWorkWeekDetailsPageElements = new AddWorkWeekDetailsPageElements();
		addReportToDetailsPageElements = new AddReportToDetailsPageElements();
		addQualificationsPageElements = new AddQualificationsPageElements();
		addMembershipPageElements = new AddMembershipPageElements();
		createDisciplinaryCasePageElements = new CreateDisciplinaryCasePageElements();
		
	}

}
