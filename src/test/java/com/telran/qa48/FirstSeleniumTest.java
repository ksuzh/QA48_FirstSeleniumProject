package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        // maximize browser to window
        driver.manage().window().maximize();

        // wait for all elements on the site to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.get("https://www.tel-ran.com"); // without history
        driver.navigate().to("https://www.tel-ran.com");// with history

        driver.navigate().to("https://www.google.com");
        
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogle(){
        System.out.println("Google opened");
    }

    //after - teardown
    @AfterMethod(enabled = true)
    public void tearDown(){
        // driver.quit(); closes all tabs
        driver.close(); //only current tab
    }

}
