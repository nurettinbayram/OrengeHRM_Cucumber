package com.sis.steps;

import com.sis.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@Before
	public void start() {
		setUp();
		
		//THIS TWO LINE ADDED BECOUSE OF THA HTTPS CONNECTION
		click(loginPageElements.warningAdvanceBtnElement);
		click(loginPageElements.warningProceedLinkElement);
	}

	@After
	public void end(Scenario scenario) {
		byte[] screenshot;

		if (scenario.isFailed()) {
			screenshot = takeScreenshot("failed/" + scenario.getName());
		} else {
			screenshot = takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(screenshot, "image/png", scenario.getName());
		tearDown();
	}
}
