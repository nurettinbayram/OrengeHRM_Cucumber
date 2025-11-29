package com.sis.testbase;

import com.sis.pages.LoginPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements loginPageElements;
	
	
	
	public static void initialize()
	{
		loginPageElements = new LoginPageElements();
		
	}

}
