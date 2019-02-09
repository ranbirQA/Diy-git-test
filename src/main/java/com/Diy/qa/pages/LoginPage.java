package com.Diy.qa.pages;

import com.Diy.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"page-top\"]/div[1]/div/nav[3]/ul/li[2]/a")
    WebElement Sigin;


    @FindBy(xpath = "//*[@id=\"email-address\"]")
    WebElement Emailaddress;

    @FindBy(name ="password")
    WebElement password;


    @FindBy(xpath = "//*[@id=\"content\"]/div/form[1]/div/div[4]/input[6]")
    WebElement SIGNINBtn;

    @FindBy(xpath = "//*[@id=\"page-top\"]/div[2]/div/div[1]/a/img")
    WebElement BnQLogo;

    //intializing the OR:
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    //Action:
    public String ValidateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean ValidateBNQLogo(){
        return BnQLogo.isDisplayed();

    }

    public HomePage SignIn(String emp,String psw){
        Sigin.click();
        Emailaddress.clear();
        password.clear();
        Emailaddress.sendKeys("aranbir50@gmail.com");
        password.sendKeys("automation123");
        SIGNINBtn.click();

        return new HomePage();




    }

}


