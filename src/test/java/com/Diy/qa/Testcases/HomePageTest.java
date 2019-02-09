package com.Diy.qa.Testcases;

import com.Diy.qa.base.TestBase;
import com.Diy.qa.pages.GARDENPAGE;
import com.Diy.qa.pages.HomePage;
import com.Diy.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage LoginPage;
    HomePage homePage;
    GARDENPAGE garden;



    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialisation();
        LoginPage = new LoginPage();
        garden = new GARDENPAGE();

        homePage=LoginPage.SignIn(prop.getProperty("email"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void HomePageTitleTest(){
    String homePageTitle=homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"DIY Supplies & Accessories | DIY at B&Q","Home page title not matched");

    }

     @Test(priority = 2)
     public void verifyUserName(){
        homePage.verifyCorrectUserName();
        Assert.assertTrue(homePage.verifyCorrectUserName());
     }


      @Test(priority = 3)
      public void verifyOutdoorNGardenLinkTest(){
      garden =homePage.clickOnOutdoorNGardenLink();
    }
















    @AfterMethod
    public void tearDown()throws Exception{
        Thread.sleep(2001);
        driver.quit();
    }
}
