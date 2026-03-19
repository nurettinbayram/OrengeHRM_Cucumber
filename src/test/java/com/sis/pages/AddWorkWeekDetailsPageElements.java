package com.sis.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class AddWorkWeekDetailsPageElements {
	@FindBy(xpath = "//form[@id='work-week-form']//tbody/tr[@form-name='salaryDetailsForm']")
	public List<WebElement> tableRowListElement;
	
	@FindBy(xpath = "//form[@id='work-week-form']//a")
	public WebElement saveButtonElement;
	
	
	
	public WebElement iconMethod(String day, int j) {
		WebElement element = BaseClass.driver.findElement(By.xpath("//form[@id='work-week-form']//tbody/tr[@day='"+day+"']//td["+j+"]//i"));
		return  element;
	}
	
	public WebElement okButtonElement(String day, int j) {
		WebElement element = BaseClass.driver.findElement(By.xpath("//form[@id='work-week-form']//tbody/tr[@day='"+day+"']//td["+j+"]//button"));
		return  element;
	}
	
	//Clock picker
	public WebElement clockPicker(String day, String time) {
		WebElement element = BaseClass.driver.findElement(By.xpath("//form[@id='work-week-form']//tr[@day='"+day+"']//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-hours']//div[text()='"+time+"']"));
		return  element;
	}
	
	//Minutes picker
	public WebElement minutesPicker(String day, String time) {
		WebElement element = BaseClass.driver.findElement(By.xpath("//form[@id='work-week-form']//tr[@day='"+day+"']//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-minutes']//div[text()='"+time+"']"));
		return  element;
	}
	
	
	
	
	public AddWorkWeekDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
