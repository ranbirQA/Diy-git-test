package com.Diy.qa.Testcases;

import com.Diy.qa.base.TestBase;
import com.Diy.qa.pages.GARDEN;
import com.Diy.qa.pages.GARDENPAGE;
import com.Diy.qa.pages.HomePage;
import com.Diy.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GARDENTest extends TestBase {

    LoginPage LoginPage;
    HomePage homePage;
    GARDENPAGE garden;
    GARDEN garden1;



    public GARDENTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialisation();
        LoginPage = new LoginPage();
        garden = new GARDENPAGE();
        garden1 = new GARDEN();
        homePage = LoginPage.SignIn(prop.getProperty("email"), prop.getProperty("password"));
        garden = homePage.clickOnOutdoorNGardenLink();
        garden1 = homePage.clickOnGardenpage();


    }

    @Test(priority = 1)
    public void validateOutdoorNGardenlable(){
        Assert.assertTrue(garden1.verifyOutdoorGardenLabel());


    }






    @AfterMethod
    public void tearDown()throws Exception{
        Thread.sleep(2001);
        driver.quit();
    }


}
