package com.Diy.qa.Testcases;

import com.Diy.qa.base.TestBase;
import com.Diy.qa.pages.HomePage;
import com.Diy.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage LoginPage;
    HomePage homepage;


    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialisation();
        LoginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void LoginPageTitleTest() {
        String title = LoginPage.ValidateLoginPageTitle();
        Assert.assertEquals(title, "DIY Supplies & Accessories | DIY at B&Q");

        // Assert.assertEquals(title,"DIY Supplies & Accessories|DIY at B&Q");

    }

    @Test(priority = 2)
    public void BnQlogoImageTest() {
        boolean flag = LoginPage.ValidateBNQLogo();
        Assert.assertTrue(flag);

    }

    @Test(priority = 3)
    public void LoginTest() {
        homepage = LoginPage.SignIn(prop.getProperty("email"), prop.getProperty("password"));

    }

    @AfterMethod
    public void tearDown()throws Exception{
        Thread.sleep(2001);
        driver.quit();
        }




    }

