package com.dl.login.webpages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    private WebDriver driver;

    //page URL

    private static String PAGE_URL ="https://my-digitallife.att.com/dl";


   //FIELDS
    // locating userid, password and sign in button

    @FindBy(name = "userid")
    private WebElement userid;

    @FindBy(name= "password")
    private WebElement password;

    @FindBy(how=How.XPATH,using = "//button")
    private WebElement sign_in_button;

    @FindAll({@FindBy(how = How.XPATH,using = "//a"),
    @FindBy(how = How.CSS,using = "css=a.forgot")})
    private WebElement forgot_link;


    //@FindBy(how=How.XPATH, using = "//a")
    //private WebElement forgot_link;

    //CONSTRUCTOR


    public HomePage(WebDriver driver) throws InterruptedException {

        //initialize element
     this.driver=driver;

     PageFactory.initElements(driver,this);
     driver.get(PAGE_URL);
     //Thread.sleep(15000);

    }

    //METHODS

    public void setUserID(String customer_username) {
       userid.sendKeys(customer_username);

    }

    public void setPassword(String customer_password) {
        password.sendKeys(customer_password);

    }

    public void clickLoginButton(){
       sign_in_button.click();

    }

    public void clickForgotLink() throws InterruptedException{

        Thread.sleep(5000);
        forgot_link.click();
    }
}
