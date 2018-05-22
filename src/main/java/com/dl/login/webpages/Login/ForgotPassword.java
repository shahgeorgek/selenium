package com.dl.login.webpages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
    public WebDriver driver;

    //Fields
    @FindBy(how = How.XPATH, using = "//h1")
    WebElement forgot_password_header;

    @FindBy(how = How.NAME, using = "f_userName")
    WebElement forgot_password_userID;

    @FindBy(how = How.NAME, using = "f_zipCode")
    WebElement forgot_password_user_zipcode;

    @FindBy(how = How.CSS, using = "li.cancelInstallation > input.btnCancel")
    WebElement forgot_password_cancel_btn;

    @FindBy(how = How.ID, using = "Resume" )
    WebElement forgot_password_cancel_resume_btn;


    @FindBy(how = How.ID, using = "submitForgotPassword")
    WebElement forgot_password_submit_btn;


    @FindBy(how = How.ID, using = "canBtn")
    WebElement forgot_password_cancel_confirmation_btn;




    //Constructor

    public ForgotPassword(WebDriver driver) throws InterruptedException {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        Thread.sleep(3000);

    }


    //Methods

    public boolean forgotPasswordLandingPage() throws InterruptedException {

        Thread.sleep(3000);

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return forgot_password_header.getText().toString().contains("Get Password - Enter Details");
    }

    public void forgotPasswordSubmit(String userID, String zipcode) {

        forgot_password_userID.click();
        forgot_password_userID.sendKeys(userID);

        forgot_password_user_zipcode.click();
        forgot_password_user_zipcode.sendKeys(zipcode);

    }

    public void clickNextButton()  {

        forgot_password_submit_btn.click();
    }

    public void clickCancelButton() throws InterruptedException {
        forgot_password_cancel_btn.click();
        Thread.sleep(2000);
        forgot_password_cancel_confirmation_btn.click();
        Thread.sleep(2000);
        driver.switchTo().window("");
    }

}
