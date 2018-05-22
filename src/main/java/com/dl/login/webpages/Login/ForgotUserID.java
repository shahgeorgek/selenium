package com.dl.login.webpages.Login;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotUserID {
    public WebDriver driver;

    //Fields
    @FindBy(xpath = "//h1")
    WebElement forgot_user_id_header;

    @FindBy(how = How.NAME,using = "f_contactEmailAddress")
    WebElement forgot_user_id_email;

    @FindBy(how = How.NAME,using = "submitContactEmail")
    WebElement forgot_user_id_submit_btn;

    @FindBy(how = How.CSS,using = "li.cancelInstallation > input.btnCancel")
    WebElement forgot_user_id_cancel_btn;

    @FindBy(how = How.NAME, using = "conContactEmailConfirmation")
    WebElement forgot_user_id_confirmation_btn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"canBtn\"]")
    WebElement forgot_user_id_cancel_confirmation_btn;

    //Constructor

    public ForgotUserID(WebDriver driver) throws InterruptedException {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        Thread.sleep(3000);

    }


    //Methods

    public boolean forgotUserIDLandingPage() throws InterruptedException {

        Thread.sleep(3000);

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();


        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
        driver.switchTo().window(winHandle);
        }


        // Perform the actions on new window
        Boolean userIDPageOpened = forgot_user_id_header.getText().contains("Get User");


        // Switch back to original browser (first window)
        //driver.switchTo().window(winHandleBefore);
        //Thread.sleep(2000);

        // Continue with original browser (first window)
        return userIDPageOpened;

    }

    public void forgotUserIDSubmit(String email) throws InterruptedException{
        forgot_user_id_email.click();
        forgot_user_id_email.sendKeys(email);
        forgot_user_id_submit_btn.click();
        forgot_user_id_confirmation_btn.click();
        Thread.sleep(2000);
    }

    public void forgotUserIDCancel() throws InterruptedException{


        Thread.sleep(2000);
        forgot_user_id_cancel_btn.click();
        Thread.sleep(2000);
        //driver.switchTo().frame(driver.findElement(By.id("modal")));
        forgot_user_id_cancel_confirmation_btn.click();
        driver.switchTo().window("");

    }
}
