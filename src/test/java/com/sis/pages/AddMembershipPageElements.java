package com.sis.pages;

import com.sis.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddMembershipPageElements {

    @FindBy(xpath = "//div[@data-tooltip='Add Membership']")
    public WebElement plusButton;

    @FindBy(xpath = "//h5[text()='Add Membership']")
    public WebElement addMembershipTitle;

    @FindBy(id = "membership")
    public WebElement membershipDropdown;

    @FindBy(id = "subscriptionPaidBy")
    public WebElement subscriptionPaidByDropdown;

    @FindBy(id = "subscriptionFee")
    public WebElement subscriptionFee;

    @FindBy(id = "subscriptionCurrency")
    public WebElement subscriptionCurrencyDropdown;

    @FindBy(id = "subscriptionCommenceDate")
    public WebElement subscriptionCommenceDate;

    @FindBy(id = "subscriptionRenewalDate")
    public WebElement subscriptionRenewalDate;

    @FindBy(xpath = "//form[@name='oxdModalForm']//label")
    public List<WebElement> listOfLabels;

    @FindBy(xpath = "//list[@listdata='listData']//table//tbody//tr//td[2]")
    public List<WebElement> listOfMemberships;

    @FindBy(xpath = "//list[@listdata='listData']//tbody")
    public WebElement tableElement;


    public AddMembershipPageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
