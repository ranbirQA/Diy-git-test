package com.Diy.qa.pages;

import com.Diy.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GARDEN extends TestBase {

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement OUTDOORNGARDENLabel;


    //intializing the OR:
    public GARDEN() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyOutdoorGardenLabel() {
        return OUTDOORNGARDENLabel.isDisplayed();
    }
}