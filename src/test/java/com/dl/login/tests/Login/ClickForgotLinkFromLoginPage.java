package com.dl.login.tests.Login;

import com.dl.login.webpages.Login.ForgotLandingPage;
import com.dl.login.webpages.Login.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ClickForgotLinkFromLoginPage {
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
    public void forgotLink() throws InterruptedException{

        HomePage home = new HomePage(driver);
        home.clickForgotLink();

        ForgotLandingPage forgot = new ForgotLandingPage(driver);

        //verifying phone number is displayed
        Assert.assertTrue(forgot.isForgotLandingPageOpened());
        Assert.assertTrue(forgot.verifyPhoneNumber());



    }
    @After
    public void close(){
        driver.close();
    }
}
