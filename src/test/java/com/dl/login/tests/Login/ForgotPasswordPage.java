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

public class ForgotPasswordPage {
    WebDriver driver;
    @Before
    public void setup() {

        //use FF Driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
        // driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void forgotPassword() throws InterruptedException {

        //Initialize and Open homepage and click on the forgot link

        HomePage home = new HomePage(driver);
        home.clickForgotLink();


       //Forgot landing page object is created
        ForgotLandingPage forgot = new ForgotLandingPage(driver);

        //clicking forgot Password link from the landing page
        forgot.clickForgotPassword();

        //Forgot password landing page object is created
        ForgotPassword password  = new ForgotPassword(driver);

        //Verifies the forgot password landing page is opened
        Assert.assertTrue(password.forgotPasswordLandingPage());

        //Enter user ID and Zipcode and then click on the Next button

        password.forgotPasswordSubmit("homeowner@att.com","30308");
        password.clickNextButton();
    }
    @After
    public void close(){
        driver.close();
    }
}
