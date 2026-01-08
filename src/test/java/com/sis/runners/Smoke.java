package com.sis.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// we may specify the path to the feature files
		features = {
				"src/test/resources/features/setup", // first run
		},

		// we may specify the path to the step definitions
		glue = "com.sis.steps", // path to the step definitions

		// we may use dry run to check for syntax errors
		dryRun = false, // if true, it will not run the tests, just check for syntax errors

		// we may set monochrome to true for better readability in the console
		monochrome = true, // if true, it will not print the console output in color

		tags = "@regression", // we can specify tags to run specific tests

		plugin = { "pretty", // prints the console output in a readable format
				"html:target/html-report/smoke.html", // generates an HTML report
				"json:target/smoke.json", // generates a JSON report
				"rerun:target/smoke.txt" // generates a rerun file for failed tests
		}

)

public class Smoke {

}
