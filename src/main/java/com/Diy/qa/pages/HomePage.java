package com.Diy.qa.pages;

import com.Diy.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {



    @FindBy(xpath = "//*[@id=\"page-top\"]/div[1]/div/nav[3]/ul/li[1]/span")
    WebElement UserWelcome;

    @FindBy(xpath = "//a[contains(text(),'Outdoor & Garden')]")
    WebElement OutdoorNGarden;



    @FindBy(xpath = "//*[@id=\"site-nav\"]/div/ul/li[1]/div/div/div/div[1]/a")
    WebElement Garden;


    @FindBy(xpath = "//a[contains(text(),'Kitchen & Bathroom')]")
    WebElement KitchenNBathroom;


    @FindBy(xpath = "//a[contains(text(),'Home & Bedroom')]")
    WebElement HomeNBedroom;


    @FindBy(xpath = "//a[contains(text(),'Building & Hardware')]")
    WebElement BuildingNHardware;


    @FindBy(xpath = "//a[contains(text(),'Painting & Decorating')]")
    WebElement PaintingNDecorating;



    //intializing the OR:
    public HomePage() {
        PageFactory.initElements(driver, this);

    }


    public String verifyHomePageTitle() {
        return driver.getTitle();

    }

    public boolean verifyCorrectUserName(){
       return UserWelcome.isDisplayed();

    }

    public GARDENPAGE clickOnOutdoorNGardenLink (){

        OutdoorNGarden.click();
       // Actions action = new Actions(driver);
       // action.moveToElement(OutdoorNGarden).build().perform();
       // GARDEN.click();
        return new GARDENPAGE();
    }


    public KITCHEN clickOnKitchenNBathroomLink() {
        KitchenNBathroom.click();
        return new KITCHEN();
    }


    public HOMEFURNISHINGS clickOnHomeNBedroomLink() {
        HomeNBedroom.click();
        return new HOMEFURNISHINGS();

    }

    public BUILDINGSUPPLIES clickOnBuildingNHardwareLink() {
        BuildingNHardware.click();
        return new BUILDINGSUPPLIES();

    }


    public PAINTINGNWOODTREATMENTS clickOnPaintingNDecoratingLink() {
        PaintingNDecorating.click();
        return new PAINTINGNWOODTREATMENTS();
    }


    public GARDEN clickOnGardenpage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(OutdoorNGarden).build().perform();
        Garden.click();
        return new GARDEN();
    }
}

