package com.Diy.qa.Testcases;

import com.Diy.qa.base.TestBase;
import com.Diy.qa.pages.GARDENPAGE;
import com.Diy.qa.pages.HomePage;
import com.Diy.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GARDENPAGETest extends TestBase {

    LoginPage LoginPage;
    HomePage homePage;
    GARDENPAGE garden;



    public GARDENPAGETest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialisation();
        LoginPage = new LoginPage();
        garden = new GARDENPAGE();
        homePage = LoginPage.SignIn(prop.getProperty("email"), prop.getProperty("password"));
        garden = homePage.clickOnOutdoorNGardenLink();
    }

      @Test(priority = 1)
      public void verifyGardenpagelabel() {
        Assert.assertTrue(garden.verifylabel(),"garden lable missing");

      }
      @Test(priority = 2)
      public void validatecreatGardenpage(){
        homePage.clickOnGardenpage();


      }



    @AfterMethod
    public void tearDown()throws Exception{
        Thread.sleep(2001);
        driver.quit();
    }




}
