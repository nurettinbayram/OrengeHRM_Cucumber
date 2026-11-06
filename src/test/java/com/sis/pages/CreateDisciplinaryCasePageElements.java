package com.sis.pages;

import com.sis.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateDisciplinaryCasePageElements {

    @FindBy(css = "#addItemBtn")
    public WebElement plusButton;

    @FindBy(xpath = "//form[@id='frmSaveDisciplinaryCase']/div/div[not(@style='display: none;')]//label")
    public List<WebElement> labelsList;

    @FindBy(id = "noncoreIframe")
    public WebElement frameElement;

    @FindBy(id = "addCase_employeeName_empName")
    public WebElement employeeName;

    @FindBy(id = "addCase_caseName")
    public WebElement caseName;

    @FindBy(id = "addCase_description")
    public WebElement caseDescription;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(id = "btnBack")
    public WebElement cancelButton;


    public CreateDisciplinaryCasePageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
