package com.sis.steps;

import java.util.Arrays;

import org.openqa.selenium.WebElement;

import com.sis.utils.CommonMethods;

import io.cucumber.java.en.When;

public class AddWorkWeekDetailsPage extends CommonMethods{
	@When("Click on WORK WEEK link")
	public void click_on_work_week_link() {
		click(personalDetailsPageElements.workWeek);
		
	}
	
	String[] weekDayString = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
	String[] weekClockTime = {"9","18","13","14"};
	String[] weekMinutesTime = {"00","00","15","05"};
	
	@When("Fill out WORK WEEK inputs")
	public void fill_out_work_week_inputs() {
		for(int i=0; i<addWorkWeekDetailsPageElements.tableRowListElement.size(); i++) {
			WebElement element = addWorkWeekDetailsPageElements.tableRowListElement.get(i);
			
			String currentDayString = element.getDomAttribute("day");
			
			if(Arrays.toString(weekDayString).contains(currentDayString)) {
				for(int j=3;j<7;j++) {
					String timeHour = weekClockTime[j-3];
					String timeMin = weekMinutesTime[j-3];
					addWorkWeekDetailsPageElements.iconMethod(currentDayString, j).click();
					click(addWorkWeekDetailsPageElements.clockPicker(currentDayString, timeHour));
					wait(1);
					click(addWorkWeekDetailsPageElements.minutesPicker(currentDayString, timeMin));
					wait(1);
					addWorkWeekDetailsPageElements.okButtonElement(currentDayString, j).click();
				}
				
			}
		}
		
	}
	@When("Click save button WORK WEEK")
	public void click_save_button_work_week() {
		click(addWorkWeekDetailsPageElements.saveButtonElement);
	}

}
