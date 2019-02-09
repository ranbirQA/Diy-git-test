package com.Diy.qa.pages;

import com.Diy.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class GARDENPAGE extends TestBase {

    @FindBy(xpath = "//*[@id=\"site-nav\"]/div/ul/li[1]/div/div/div/div[1]/a")
    WebElement GARDENlabel;


    //intializing the OR:
    public GARDENPAGE() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifylabel(){
        return GARDENlabel.isDisplayed();

    }


}






