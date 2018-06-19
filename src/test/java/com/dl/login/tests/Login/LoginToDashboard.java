package com.dl.login.tests.Login;

import com.dl.login.webpages.Login.HomePage.HomePage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginToDashboard {
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
    public void dlHomepage() throws InterruptedException{
        HomePage home = new HomePage(driver);
        home.setUserID("homeowner");
        home.setPassword("tester");
        home.clickLoginButton();
        Thread.sleep(3000);

    }

    @After

    public void close(){
    driver.close();

   }
}