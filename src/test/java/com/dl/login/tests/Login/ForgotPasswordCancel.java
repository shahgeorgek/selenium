package com.dl.login.tests.Login;

import com.dl.login.webpages.Login.ForgotLandingPage;
import com.dl.login.webpages.Login.ForgotPassword;
import com.dl.login.webpages.Login.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ForgotPasswordCancel {
    WebDriver driver;
    @Before
    public void setup() {

        //use FF Driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
       //  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
       //  driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void forgotPassword() throws InterruptedException {

        //Home page object is created
        HomePage home = new HomePage(driver);
        home.clickForgotLink();


       //Forgot landing page object is created
        ForgotLandingPage forgot = new ForgotLandingPage(driver);

        //clicking forgot user id link from the landing page
        forgot.clickForgotPassword();

        //Forgot Password page object is created
        ForgotPassword password = new ForgotPassword(driver);

        //verify forgot Password page is opened
        Assert.assertTrue(password.forgotPasswordLandingPage());

        //selects the cancel button
        password.clickCancelButton();

    }
    @After

    public void close(){

    driver.close();

    }
}
