package com.dl.login.webpages.Login.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageView {

    //Constructor

    public HomePageView(WebDriver driver) {

     PageFactory.initElements(driver, this);

      }

//Fields

    @FindBy(name = "userid")
    private WebElement userid;

    @FindBy(name= "password")
    private WebElement password;

    @FindBy(how=How.XPATH,using = "//button")
    private WebElement sign_in_button;

    @FindAll({@FindBy(how = How.XPATH,using = "//a"),
            @FindBy(how = How.CSS,using = "css=a.forgot")})

    public WebElement forgot_link;

    //Getter

    public WebElement getUserid() {
        return userid;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement clickSign_In_Button() {
        return sign_in_button;
    }
// added some changes for git testing.
    public WebElement clickForgot_Link() {
        return forgot_link;
    }
}

