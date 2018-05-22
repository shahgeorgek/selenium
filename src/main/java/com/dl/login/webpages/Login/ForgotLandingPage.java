package com.dl.login.webpages.Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotLandingPage {
    private WebDriver driver;


    //Fields

    //@FindBy(how=How.,using = "/html/body/div[4]/div/div/div/div/div[1]")
    //private WebElement forgot_landing_page_header;

    @FindBy(how =How.CSS, using = "div.sign-in-text")
    private WebElement forgot_landing_page_header;

    @FindBy(how = How.CSS, using = "span.phone")
    private WebElement forgot_landing_telephone;

    @FindBy(how = How.CSS, using = "button.btn.primary")
    private WebElement forgot_cancel_button;

    @FindBy(how = How.CSS, using = "div.user-id")
    private WebElement forgot_user_id;

    @FindBy(how = How.CSS, using = "div.password")
    private WebElement forgot_password;

    //Constructor
    public ForgotLandingPage(WebDriver driver){

        //initialize element
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    //methods

    public boolean isForgotLandingPageOpened(){
        return forgot_landing_page_header.getText().toString().contains("Forgot user ID or password");
    }

    public boolean verifyPhoneNumber() throws InterruptedException{
        Thread.sleep(5000);
        return forgot_landing_telephone.getText().toString().equals("1-855-288-2727");
    }


    public void clickForgotUserID() throws InterruptedException{

        Thread.sleep(3000);
        forgot_user_id.click();
    }

    public void clickForgotPassword() throws InterruptedException {
        Thread.sleep(3000);
        forgot_password.click();

    }

    public void clickCancelButton() throws InterruptedException{

        Thread.sleep(5000);
        forgot_cancel_button.click();

    }


}
